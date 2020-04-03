package com.atguigu.gmall.oms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;

import com.atguigu.gmall.oms.mapper.OmsOrderReturnReasonMapper;
import com.atguigu.gmall.oms.entity.OmsOrderReturnReasonEntity;
import com.atguigu.gmall.oms.service.OmsOrderReturnReasonService;


@Service("omsOrderReturnReasonService")
public class OmsOrderReturnReasonServiceImpl extends ServiceImpl<OmsOrderReturnReasonMapper, OmsOrderReturnReasonEntity> implements OmsOrderReturnReasonService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<OmsOrderReturnReasonEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<OmsOrderReturnReasonEntity>()
        );

        return new PageResultVo(page);
    }

}