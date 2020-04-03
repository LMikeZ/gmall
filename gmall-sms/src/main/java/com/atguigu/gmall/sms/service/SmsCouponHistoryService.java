package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.sms.entity.SmsCouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author lz
 * @email 1264408878@qq.com
 * @date 2020-03-31 21:25:33
 */
public interface SmsCouponHistoryService extends IService<SmsCouponHistoryEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

