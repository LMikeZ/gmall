package com.atguigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;

import com.atguigu.gmall.sms.mapper.SmsSpuBoundsMapper;
import com.atguigu.gmall.sms.entity.SmsSpuBoundsEntity;
import com.atguigu.gmall.sms.service.SmsSpuBoundsService;


@Service("smsSpuBoundsService")
public class SmsSpuBoundsServiceImpl extends ServiceImpl<SmsSpuBoundsMapper, SmsSpuBoundsEntity> implements SmsSpuBoundsService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<SmsSpuBoundsEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<SmsSpuBoundsEntity>()
        );

        return new PageResultVo(page);
    }

}