package com.wvqnllb.capybaramall.coupon.dao;

import com.wvqnllb.capybaramall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author ninan
 * @email nicnanchim@gmail.com
 * @date 2020-11-16 11:03:30
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
