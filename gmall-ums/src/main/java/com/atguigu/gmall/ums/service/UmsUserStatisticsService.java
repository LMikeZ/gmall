package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.ums.entity.UmsUserStatisticsEntity;

import java.util.Map;

/**
 * 统计信息表
 *
 * @author lz
 * @email 1264408878@qq.com
 * @date 2020-03-31 21:42:33
 */
public interface UmsUserStatisticsService extends IService<UmsUserStatisticsEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

