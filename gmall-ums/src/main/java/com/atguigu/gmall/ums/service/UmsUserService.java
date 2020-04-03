package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.ums.entity.UmsUserEntity;

import java.util.Map;

/**
 * 用户表
 *
 * @author lz
 * @email 1264408878@qq.com
 * @date 2020-03-31 21:42:32
 */
public interface UmsUserService extends IService<UmsUserEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

