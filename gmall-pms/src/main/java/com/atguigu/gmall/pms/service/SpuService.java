package com.atguigu.gmall.pms.service;

import com.atguigu.gmall.pms.Vo.SpuVo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.pms.entity.SpuEntity;

import java.io.FileNotFoundException;
import java.util.Map;

/**
 * spu信息
 *
 * @author lz
 * @email 1264408878@qq.com
 * @date 2020-03-31 20:46:02
 */
public interface SpuService extends IService<SpuEntity> {

    PageResultVo queryPage(PageParamVo paramVo);

    PageResultVo querySpusByCidPage(PageParamVo pageParamVo, Long categoryId);

    void bigSave(SpuVo spuVo) throws FileNotFoundException;

}

