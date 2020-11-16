package com.wvqnllb.capybaramall.member.dao;

import com.wvqnllb.capybaramall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author ninan
 * @email nicnanchim@gmail.com
 * @date 2020-11-16 11:12:17
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
