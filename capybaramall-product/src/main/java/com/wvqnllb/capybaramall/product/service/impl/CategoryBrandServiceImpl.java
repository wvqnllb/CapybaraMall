package com.wvqnllb.capybaramall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wvqnllb.common.utils.PageUtils;
import com.wvqnllb.common.utils.Query;

import com.wvqnllb.capybaramall.product.dao.CategoryBrandDao;
import com.wvqnllb.capybaramall.product.entity.CategoryBrandEntity;
import com.wvqnllb.capybaramall.product.service.CategoryBrandService;


@Service("categoryBrandService")
public class CategoryBrandServiceImpl extends ServiceImpl<CategoryBrandDao, CategoryBrandEntity> implements CategoryBrandService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryBrandEntity> page = this.page(
                new Query<CategoryBrandEntity>().getPage(params),
                new QueryWrapper<CategoryBrandEntity>()
        );

        return new PageUtils(page);
    }

}