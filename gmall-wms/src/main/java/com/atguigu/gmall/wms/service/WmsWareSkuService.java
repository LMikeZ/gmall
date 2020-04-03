package com.atguigu.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.wms.entity.WmsWareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author lz
 * @email 1264408878@qq.com
 * @date 2020-03-31 21:43:03
 */
public interface WmsWareSkuService extends IService<WmsWareSkuEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

