package com.atguigu.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.oms.entity.OmsOrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author lz
 * @email 1264408878@qq.com
 * @date 2020-03-31 21:41:33
 */
public interface OmsOrderService extends IService<OmsOrderEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

