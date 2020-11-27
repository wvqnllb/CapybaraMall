package com.wvqnllb.capybaramall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wvqnllb.common.utils.PageUtils;
import com.wvqnllb.common.utils.Query;

import com.wvqnllb.capybaramall.product.dao.CommentDao;
import com.wvqnllb.capybaramall.product.entity.CommentEntity;
import com.wvqnllb.capybaramall.product.service.CommentService;


@Service("commentService")
public class CommentServiceImpl extends ServiceImpl<CommentDao, CommentEntity> implements CommentService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CommentEntity> page = this.page(
                new Query<CommentEntity>().getPage(params),
                new QueryWrapper<CommentEntity>()
        );

        return new PageUtils(page);
    }

}