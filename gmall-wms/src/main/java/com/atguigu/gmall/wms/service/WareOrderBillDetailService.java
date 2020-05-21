package com.atguigu.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.wms.entity.WareOrderBillDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author lz
 * @email 1264408878@qq.com
 * @date 2020-04-04 20:40:54
 */
public interface WareOrderBillDetailService extends IService<WareOrderBillDetailEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}
