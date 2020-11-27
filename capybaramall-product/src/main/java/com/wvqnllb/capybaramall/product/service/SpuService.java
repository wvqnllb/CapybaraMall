package com.wvqnllb.capybaramall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wvqnllb.common.utils.PageUtils;
import com.wvqnllb.capybaramall.product.entity.SpuEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author ninan
 * @email sunlightcs@gmail.com
 * @date 2020-11-15 16:46:26
 */
public interface SpuService extends IService<SpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

