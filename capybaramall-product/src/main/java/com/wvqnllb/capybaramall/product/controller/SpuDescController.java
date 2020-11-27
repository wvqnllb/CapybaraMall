package com.wvqnllb.capybaramall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wvqnllb.capybaramall.product.entity.SpuDescEntity;
import com.wvqnllb.capybaramall.product.service.SpuDescService;
import com.wvqnllb.common.utils.PageUtils;
import com.wvqnllb.common.utils.R;



/**
 * spu信息介绍
 *
 * @author ninan
 * @email sunlightcs@gmail.com
 * @date 2020-11-15 17:28:00
 */
@RestController
@RequestMapping("product/spudesc")
public class SpuDescController {
    @Autowired
    private SpuDescService spuDescService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = spuDescService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{spuId}")
    public R info(@PathVariable("spuId") Long spuId){
		SpuDescEntity spuDesc = spuDescService.getById(spuId);

        return R.ok().put("spuDesc", spuDesc);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SpuDescEntity spuDesc){
		spuDescService.save(spuDesc);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SpuDescEntity spuDesc){
		spuDescService.updateById(spuDesc);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] spuIds){
		spuDescService.removeByIds(Arrays.asList(spuIds));

        return R.ok();
    }

}
