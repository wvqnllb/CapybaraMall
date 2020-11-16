package com.wvqnllb.capybaramall.member.dao;

import com.wvqnllb.capybaramall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author ninan
 * @email nicnanchim@gmail.com
 * @date 2020-11-16 11:12:17
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
