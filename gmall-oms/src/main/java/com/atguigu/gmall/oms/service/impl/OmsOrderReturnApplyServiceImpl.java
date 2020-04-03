package com.atguigu.gmall.oms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;

import com.atguigu.gmall.oms.mapper.OmsOrderReturnApplyMapper;
import com.atguigu.gmall.oms.entity.OmsOrderReturnApplyEntity;
import com.atguigu.gmall.oms.service.OmsOrderReturnApplyService;


@Service("omsOrderReturnApplyService")
public class OmsOrderReturnApplyServiceImpl extends ServiceImpl<OmsOrderReturnApplyMapper, OmsOrderReturnApplyEntity> implements OmsOrderReturnApplyService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<OmsOrderReturnApplyEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<OmsOrderReturnApplyEntity>()
        );

        return new PageResultVo(page);
    }

}