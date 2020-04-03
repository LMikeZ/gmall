package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.sms.entity.SmsHomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author lz
 * @email 1264408878@qq.com
 * @date 2020-03-31 21:25:33
 */
public interface SmsHomeAdvService extends IService<SmsHomeAdvEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

