package com.atguigu.gmall.pms.service.impl;

import com.alibaba.nacos.client.naming.utils.CollectionUtils;
import com.alibaba.nacos.client.utils.StringUtils;
import com.atguigu.gmall.pms.Vo.SpuVo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;

import com.atguigu.gmall.pms.mapper.SpuDescMapper;
import com.atguigu.gmall.pms.entity.SpuDescEntity;
import com.atguigu.gmall.pms.service.SpuDescService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service("spuDescService")
public class SpuDescServiceImpl extends ServiceImpl<SpuDescMapper, SpuDescEntity> implements SpuDescService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<SpuDescEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<SpuDescEntity>()
        );

        return new PageResultVo(page);
    }


    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void saveSpuDesc(SpuVo spuVo) {
        List<String> spuImages = spuVo.getSpuImages();
        // 判断用户是否上传了图片
        if (!CollectionUtils.isEmpty(spuImages)) {
            SpuDescEntity spuDescEntity = new SpuDescEntity();
            spuDescEntity.setSpuId(spuVo.getId());
            spuDescEntity.setDecript(StringUtils.join(spuImages, ","));
            this.save(spuDescEntity);
        }
    }
}