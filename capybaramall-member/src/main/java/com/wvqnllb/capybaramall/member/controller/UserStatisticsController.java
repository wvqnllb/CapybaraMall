package com.wvqnllb.capybaramall.member.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wvqnllb.capybaramall.member.entity.UserStatisticsEntity;
import com.wvqnllb.capybaramall.member.service.UserStatisticsService;
import com.wvqnllb.common.utils.PageUtils;
import com.wvqnllb.common.utils.R;



/**
 * 统计信息表
 *
 * @author ninan
 * @email nicnanchim@gmail.com
 * @date 2020-11-16 11:12:18
 */
@RestController
@RequestMapping("member/userstatistics")
public class UserStatisticsController {
    @Autowired
    private UserStatisticsService userStatisticsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = userStatisticsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		UserStatisticsEntity userStatistics = userStatisticsService.getById(id);

        return R.ok().put("userStatistics", userStatistics);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody UserStatisticsEntity userStatistics){
		userStatisticsService.save(userStatistics);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody UserStatisticsEntity userStatistics){
		userStatisticsService.updateById(userStatistics);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		userStatisticsService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
