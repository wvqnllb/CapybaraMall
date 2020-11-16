package com.wvqnllb.capybaramall.ware.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wvqnllb.common.utils.PageUtils;
import com.wvqnllb.common.utils.Query;

import com.wvqnllb.capybaramall.ware.dao.WareOrderBillDao;
import com.wvqnllb.capybaramall.ware.entity.WareOrderBillEntity;
import com.wvqnllb.capybaramall.ware.service.WareOrderBillService;


@Service("wareOrderBillService")
public class WareOrderBillServiceImpl extends ServiceImpl<WareOrderBillDao, WareOrderBillEntity> implements WareOrderBillService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WareOrderBillEntity> page = this.page(
                new Query<WareOrderBillEntity>().getPage(params),
                new QueryWrapper<WareOrderBillEntity>()
        );

        return new PageUtils(page);
    }

}