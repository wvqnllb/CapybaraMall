package com.wvqnllb.capybaramall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wvqnllb.common.utils.PageUtils;
import com.wvqnllb.capybaramall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author ninan
 * @email sunlightcs@gmail.com
 * @date 2020-11-15 16:46:25
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    void removeMenuByIds(List<Long> asList);
}

