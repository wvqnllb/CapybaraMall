package com.wvqnllb.capybaramall.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wvqnllb.capybaramall.product.entity.CategoryEntity;
import com.wvqnllb.capybaramall.product.service.CategoryService;
import com.wvqnllb.common.utils.PageUtils;
import com.wvqnllb.common.utils.R;



/**
 * 商品三级分类
 *
 * @author ninan
 * @email sunlightcs@gmail.com
 * @date 2020-11-15 17:28:00
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 查出所有分类和子分类
     * 以树形结构组装起来
     */
    @RequestMapping("/list/tree")
    public R list(){
        List<CategoryEntity> entities = categoryService.listWithTree();


        return R.ok().put("data", entities);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    public R info(@PathVariable("catId") Long catId){
		CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("data", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CategoryEntity category){
		categoryService.save(category);

        return R.ok();
    }


    /**
     *
     * @param categories
     * @return
     */
    @RequestMapping("/update/sort")
    public R updateSort(@RequestBody CategoryEntity[] categories){
        categoryService.updateBatchById(Arrays.asList(categories));
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CategoryEntity category){
		categoryService.updateById(category);

        return R.ok();
    }

    /**
     * 删除
     * @RequestBody： 获取请求体 只有post请求 必须发送post请求
     * SpringMVC会自动将请求体的数据(json) 转换成对应的对象
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] catIds){
        //检查当前删除的菜单是否被其他地方引用
		categoryService.removeMenuByIds(Arrays.asList(catIds));

        return R.ok();
    }

}
