package com.atguigu.gmall.pms.Vo;

import com.atguigu.gmall.pms.entity.SpuEntity;
import lombok.Data;

import java.util.List;

/**
 * @Classname SpuVo
 * @Description TODO
 * @Date 2020/4/5 10:18
 * @Created by li
 */
@Data
public class SpuVo extends SpuEntity {


    // 图片信息
    private List<String> spuImages;

    // 基本属性信息
    private List<SpuAttrValueVo> baseAttrs;

    // sku信息
    private List<SkuVo> skus;
}
