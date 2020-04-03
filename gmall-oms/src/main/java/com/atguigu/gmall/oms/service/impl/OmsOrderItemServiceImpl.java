package com.atguigu.gmall.oms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;

import com.atguigu.gmall.oms.mapper.OmsOrderItemMapper;
import com.atguigu.gmall.oms.entity.OmsOrderItemEntity;
import com.atguigu.gmall.oms.service.OmsOrderItemService;


@Service("omsOrderItemService")
public class OmsOrderItemServiceImpl extends ServiceImpl<OmsOrderItemMapper, OmsOrderItemEntity> implements OmsOrderItemService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<OmsOrderItemEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<OmsOrderItemEntity>()
        );

        return new PageResultVo(page);
    }

}