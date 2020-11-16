package com.wvqnllb.capybaramall.member.dao;

import com.wvqnllb.capybaramall.member.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author ninan
 * @email nicnanchim@gmail.com
 * @date 2020-11-16 11:12:18
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {
	
}
