package com.wvqnllb.capybaramall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wvqnllb.common.utils.PageUtils;
import com.wvqnllb.capybaramall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author ninan
 * @email sunlightcs@gmail.com
 * @date 2020-11-15 16:46:25
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

