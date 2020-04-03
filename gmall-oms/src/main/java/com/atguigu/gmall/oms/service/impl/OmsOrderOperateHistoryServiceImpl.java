package com.atguigu.gmall.oms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;

import com.atguigu.gmall.oms.mapper.OmsOrderOperateHistoryMapper;
import com.atguigu.gmall.oms.entity.OmsOrderOperateHistoryEntity;
import com.atguigu.gmall.oms.service.OmsOrderOperateHistoryService;


@Service("omsOrderOperateHistoryService")
public class OmsOrderOperateHistoryServiceImpl extends ServiceImpl<OmsOrderOperateHistoryMapper, OmsOrderOperateHistoryEntity> implements OmsOrderOperateHistoryService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<OmsOrderOperateHistoryEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<OmsOrderOperateHistoryEntity>()
        );

        return new PageResultVo(page);
    }

}