package com.atguigu.gmall.oms.mapper;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lz
 * @email 1264408878@qq.com
 * @date 2020-04-04 20:50:20
 */
@Mapper
public interface OrderMapper extends BaseMapper<OrderEntity> {
	
}
