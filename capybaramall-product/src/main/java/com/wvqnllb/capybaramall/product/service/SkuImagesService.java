package com.wvqnllb.capybaramall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wvqnllb.common.utils.PageUtils;
import com.wvqnllb.capybaramall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author ninan
 * @email sunlightcs@gmail.com
 * @date 2020-11-15 16:46:25
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

