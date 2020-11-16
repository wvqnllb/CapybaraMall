package com.wvqnllb.capybaramall.member.dao;

import com.wvqnllb.capybaramall.member.entity.UserLevelEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员等级表
 * 
 * @author ninan
 * @email nicnanchim@gmail.com
 * @date 2020-11-16 11:12:18
 */
@Mapper
public interface UserLevelDao extends BaseMapper<UserLevelEntity> {
	
}
