package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.sms.entity.SmsSkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author lz
 * @email 1264408878@qq.com
 * @date 2020-03-31 21:25:33
 */
public interface SmsSkuFullReductionService extends IService<SmsSkuFullReductionEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

