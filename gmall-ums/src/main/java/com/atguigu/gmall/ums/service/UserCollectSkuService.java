package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.ums.entity.UserCollectSkuEntity;

import java.util.Map;

/**
 * 关注商品表
 *
 * @author lz
 * @email 1264408878@qq.com
 * @date 2020-04-04 20:47:49
 */
public interface UserCollectSkuService extends IService<UserCollectSkuEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

