package com.wvqnllb.capybaramall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wvqnllb.common.utils.PageUtils;
import com.wvqnllb.capybaramall.ware.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author ninan
 * @email nicnanchim@gmail.com
 * @date 2020-11-16 11:29:34
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

