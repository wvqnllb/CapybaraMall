package com.wvqnllb.capybaramall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wvqnllb.common.utils.PageUtils;
import com.wvqnllb.capybaramall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author ninan
 * @email nicnanchim@gmail.com
 * @date 2020-11-16 11:12:17
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

