package com.wvqnllb.capybaramall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wvqnllb.common.utils.PageUtils;
import com.wvqnllb.common.utils.Query;

import com.wvqnllb.capybaramall.product.dao.CategoryDao;
import com.wvqnllb.capybaramall.product.entity.CategoryEntity;
import com.wvqnllb.capybaramall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    private List<CategoryEntity> categoryEntities;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //查出所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);
        //组装成父子的树形结构
        //1 找到所有的一级分类 父分类id为0
        List<CategoryEntity> level1Menus = entities.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() == 0;
        }).map((menu)->{
            menu.setChildren(getChildren(menu, entities));
            return menu;
        }).sorted((menu1, menu2)->{
            return (menu1.getSort() == null? 0: menu1.getSort()) - (menu2.getSort() == null? 0: menu2.getSort());
        }).
        collect(Collectors.toList());

        return level1Menus;
    }

    @Override
    public void removeMenuByIds(List<Long> asList) {
        //TODO 检查当前删除的菜单 是否被别的地方引用

        //逻辑删除 一般不用物理删除 比如加一个标志位 show_status
        baseMapper.deleteBatchIds(asList);
    }

    //递归查找所有菜单的子菜单
    private List<CategoryEntity> getChildren (CategoryEntity root, List<CategoryEntity> all) {

        List<CategoryEntity> children = all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() == root.getCatId();
        }).map(categoryEntity -> {
            categoryEntity.setChildren(getChildren(categoryEntity, all));
            return categoryEntity;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort() == null? 0: menu1.getSort()) - (menu2.getSort() == null? 0: menu2.getSort());
        })
        .collect(Collectors.toList());
        return children;
    }

}