package com.wvqnllb.capybaramall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wvqnllb.capybaramall.product.entity.SkuEntity;
import com.wvqnllb.capybaramall.product.service.SkuService;
import com.wvqnllb.common.utils.PageUtils;
import com.wvqnllb.common.utils.R;



/**
 * sku信息
 *
 * @author ninan
 * @email sunlightcs@gmail.com
 * @date 2020-11-15 17:28:01
 */
@RestController
@RequestMapping("product/sku")
public class SkuController {
    @Autowired
    private SkuService skuService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = skuService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		SkuEntity sku = skuService.getById(id);

        return R.ok().put("sku", sku);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SkuEntity sku){
		skuService.save(sku);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SkuEntity sku){
		skuService.updateById(sku);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		skuService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
