package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.ums.entity.UmsUserCollectSkuEntity;

import java.util.Map;

/**
 * 关注商品表
 *
 * @author lz
 * @email 1264408878@qq.com
 * @date 2020-03-31 21:42:32
 */
public interface UmsUserCollectSkuService extends IService<UmsUserCollectSkuEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

