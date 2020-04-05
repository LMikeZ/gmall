package com.atguigu.gmall.pms.Vo;

import com.atguigu.gmall.pms.entity.AttrEntity;
import com.atguigu.gmall.pms.entity.AttrGroupEntity;
import lombok.Data;

import java.util.List;

/**
 * @Classname GroupVo
 * @Description TODO
 * @Date 2020/4/4 21:10
 * @Created by li
 */
@Data
public class GroupVo extends AttrGroupEntity {

    private List<AttrEntity> attrEntities;
}
