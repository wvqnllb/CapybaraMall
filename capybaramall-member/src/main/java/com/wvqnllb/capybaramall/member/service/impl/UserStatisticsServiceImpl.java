package com.wvqnllb.capybaramall.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wvqnllb.common.utils.PageUtils;
import com.wvqnllb.common.utils.Query;

import com.wvqnllb.capybaramall.member.dao.UserStatisticsDao;
import com.wvqnllb.capybaramall.member.entity.UserStatisticsEntity;
import com.wvqnllb.capybaramall.member.service.UserStatisticsService;


@Service("userStatisticsService")
public class UserStatisticsServiceImpl extends ServiceImpl<UserStatisticsDao, UserStatisticsEntity> implements UserStatisticsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UserStatisticsEntity> page = this.page(
                new Query<UserStatisticsEntity>().getPage(params),
                new QueryWrapper<UserStatisticsEntity>()
        );

        return new PageUtils(page);
    }

}