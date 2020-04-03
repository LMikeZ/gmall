package com.atguigu.gmall.oms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;

import com.atguigu.gmall.oms.mapper.OmsOrderSettingMapper;
import com.atguigu.gmall.oms.entity.OmsOrderSettingEntity;
import com.atguigu.gmall.oms.service.OmsOrderSettingService;


@Service("omsOrderSettingService")
public class OmsOrderSettingServiceImpl extends ServiceImpl<OmsOrderSettingMapper, OmsOrderSettingEntity> implements OmsOrderSettingService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<OmsOrderSettingEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<OmsOrderSettingEntity>()
        );

        return new PageResultVo(page);
    }

}