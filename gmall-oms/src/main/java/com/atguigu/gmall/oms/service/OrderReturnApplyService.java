package com.atguigu.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.oms.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author lz
 * @email 1264408878@qq.com
 * @date 2020-04-04 20:50:20
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

