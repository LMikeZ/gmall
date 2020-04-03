package com.atguigu.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.wms.entity.WmsPurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author lz
 * @email 1264408878@qq.com
 * @date 2020-03-31 21:43:03
 */
public interface WmsPurchaseService extends IService<WmsPurchaseEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

