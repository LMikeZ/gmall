package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.sms.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author lz
 * @email 1264408878@qq.com
 * @date 2020-04-05 15:51:57
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

