package com.wvqnllb.capybaramall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wvqnllb.common.utils.PageUtils;
import com.wvqnllb.capybaramall.product.entity.SkuAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author ninan
 * @email sunlightcs@gmail.com
 * @date 2020-11-15 16:46:26
 */
public interface SkuAttrValueService extends IService<SkuAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

