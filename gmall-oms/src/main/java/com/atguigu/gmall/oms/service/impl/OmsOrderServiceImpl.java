package com.atguigu.gmall.oms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;

import com.atguigu.gmall.oms.mapper.OmsOrderMapper;
import com.atguigu.gmall.oms.entity.OmsOrderEntity;
import com.atguigu.gmall.oms.service.OmsOrderService;


@Service("omsOrderService")
public class OmsOrderServiceImpl extends ServiceImpl<OmsOrderMapper, OmsOrderEntity> implements OmsOrderService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<OmsOrderEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<OmsOrderEntity>()
        );

        return new PageResultVo(page);
    }

}