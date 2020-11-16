package com.wvqnllb.capybaramall.member.dao;

import com.wvqnllb.capybaramall.member.entity.UserLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户登陆记录表
 * 
 * @author ninan
 * @email nicnanchim@gmail.com
 * @date 2020-11-16 11:12:18
 */
@Mapper
public interface UserLoginLogDao extends BaseMapper<UserLoginLogEntity> {
	
}
