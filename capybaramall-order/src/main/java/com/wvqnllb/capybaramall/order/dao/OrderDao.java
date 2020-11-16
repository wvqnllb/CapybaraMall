package com.wvqnllb.capybaramall.order.dao;

import com.wvqnllb.capybaramall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author ninan
 * @email nicnanchim@gmail.com
 * @date 2020-11-16 11:18:56
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
