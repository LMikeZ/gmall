package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.ums.entity.UmsUserLoginLogEntity;

import java.util.Map;

/**
 * 用户登陆记录表
 *
 * @author lz
 * @email 1264408878@qq.com
 * @date 2020-03-31 21:42:33
 */
public interface UmsUserLoginLogService extends IService<UmsUserLoginLogEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

