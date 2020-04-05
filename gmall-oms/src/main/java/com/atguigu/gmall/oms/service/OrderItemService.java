package com.atguigu.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.oms.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author lz
 * @email 1264408878@qq.com
 * @date 2020-04-04 20:50:20
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

