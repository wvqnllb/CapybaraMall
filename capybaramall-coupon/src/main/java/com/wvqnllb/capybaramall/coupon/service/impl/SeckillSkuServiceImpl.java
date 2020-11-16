package com.wvqnllb.capybaramall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wvqnllb.common.utils.PageUtils;
import com.wvqnllb.common.utils.Query;

import com.wvqnllb.capybaramall.coupon.dao.SeckillSkuDao;
import com.wvqnllb.capybaramall.coupon.entity.SeckillSkuEntity;
import com.wvqnllb.capybaramall.coupon.service.SeckillSkuService;


@Service("seckillSkuService")
public class SeckillSkuServiceImpl extends ServiceImpl<SeckillSkuDao, SeckillSkuEntity> implements SeckillSkuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SeckillSkuEntity> page = this.page(
                new Query<SeckillSkuEntity>().getPage(params),
                new QueryWrapper<SeckillSkuEntity>()
        );

        return new PageUtils(page);
    }

}