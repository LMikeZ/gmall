package com.atguigu.gmall.oms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;

import com.atguigu.gmall.oms.mapper.OmsPaymentInfoMapper;
import com.atguigu.gmall.oms.entity.OmsPaymentInfoEntity;
import com.atguigu.gmall.oms.service.OmsPaymentInfoService;


@Service("omsPaymentInfoService")
public class OmsPaymentInfoServiceImpl extends ServiceImpl<OmsPaymentInfoMapper, OmsPaymentInfoEntity> implements OmsPaymentInfoService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<OmsPaymentInfoEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<OmsPaymentInfoEntity>()
        );

        return new PageResultVo(page);
    }

}