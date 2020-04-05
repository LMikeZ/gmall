package com.atguigu.gmall.pms.Vo;

import com.alibaba.nacos.client.naming.utils.CollectionUtils;
import com.alibaba.nacos.client.utils.StringUtils;
import com.atguigu.gmall.pms.entity.SpuAttrValueEntity;

import java.util.List;

/**
 * @Classname SpuAttrValueVo
 * @Description TODO
 * @Date 2020/4/5 10:43
 * @Created by li
 */
public class SpuAttrValueVo extends SpuAttrValueEntity {

    public void setValueSelected(List<Object> valueSelected){
        // 如果接受的集合为空，则不设置
        if (CollectionUtils.isEmpty(valueSelected)){
            return;
        }
        this.setAttrValue(StringUtils.join(valueSelected, ","));
    }
}
