package com.wvqnllb.capybaramall.product.dao;

import com.wvqnllb.capybaramall.product.entity.CommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author ninan
 * @email sunlightcs@gmail.com
 * @date 2020-11-15 16:46:26
 */
@Mapper
public interface CommentDao extends BaseMapper<CommentEntity> {
	
}
