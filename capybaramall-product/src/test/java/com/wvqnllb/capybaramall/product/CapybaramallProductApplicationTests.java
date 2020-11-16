package com.wvqnllb.capybaramall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wvqnllb.capybaramall.product.entity.BrandEntity;
import com.wvqnllb.capybaramall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLOutput;
import java.util.List;

@SpringBootTest
class CapybaramallProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        //插入操作
//        brandEntity.setName("blackpink");
//        brandService.save(brandEntity);
//        System.out.println("保存成功");
        //更新操作
//        brandEntity.setBrandId(13L);
//        brandEntity.setDescript("Jenniee is Good");
//        brandService.updateById(brandEntity);
        //query
        List<BrandEntity> brandEntityList = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 13L));
        brandEntityList.forEach(System.out::println);
    }

}
