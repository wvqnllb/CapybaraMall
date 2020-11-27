package com.wvqnllb.capybaramall.product.dao;

import com.wvqnllb.capybaramall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author ninan
 * @email sunlightcs@gmail.com
 * @date 2020-11-15 16:46:25
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
