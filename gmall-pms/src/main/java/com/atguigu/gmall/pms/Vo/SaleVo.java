package com.atguigu.gmall.pms.Vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Classname SaleVo
 * @Description TODO
 * @Date 2020/4/5 15:46
 * @Created by li
 */
@Data
public class SaleVo {

    private Long skuId;
    // sku积分相关信息
    private BigDecimal growBounds;
    private BigDecimal buyBounds;
    private List<Integer> work;

    // sku满减信息
    private BigDecimal fullPrice;
    private BigDecimal reducePrice;
    private Integer fullAddOther;

    // sku打折信息
    private Integer fullCount;
    private BigDecimal discount;
    private Integer ladderAddOther;

}
