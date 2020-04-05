package com.atguigu.gmall.sms.mapper;

import com.atguigu.gmall.sms.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author lz
 * @email 1264408878@qq.com
 * @date 2020-04-05 15:51:57
 */
@Mapper
public interface CouponHistoryMapper extends BaseMapper<CouponHistoryEntity> {
	
}
