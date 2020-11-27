package com.wvqnllb.capybaramall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wvqnllb.capybaramall.product.entity.CommentEntity;
import com.wvqnllb.capybaramall.product.service.CommentService;
import com.wvqnllb.common.utils.PageUtils;
import com.wvqnllb.common.utils.R;



/**
 * 商品评价
 *
 * @author ninan
 * @email sunlightcs@gmail.com
 * @date 2020-11-15 17:28:01
 */
@RestController
@RequestMapping("product/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = commentService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		CommentEntity comment = commentService.getById(id);

        return R.ok().put("comment", comment);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CommentEntity comment){
		commentService.save(comment);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CommentEntity comment){
		commentService.updateById(comment);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		commentService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
