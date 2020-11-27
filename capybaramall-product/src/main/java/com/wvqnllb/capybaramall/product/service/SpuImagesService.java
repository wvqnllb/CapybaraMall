package com.wvqnllb.capybaramall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wvqnllb.common.utils.PageUtils;
import com.wvqnllb.capybaramall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author ninan
 * @email sunlightcs@gmail.com
 * @date 2020-11-15 16:46:25
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

