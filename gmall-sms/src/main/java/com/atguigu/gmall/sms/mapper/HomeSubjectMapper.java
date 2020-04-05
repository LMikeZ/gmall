package com.atguigu.gmall.sms.mapper;

import com.atguigu.gmall.sms.entity.HomeSubjectEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 * 
 * @author lz
 * @email 1264408878@qq.com
 * @date 2020-04-05 15:51:57
 */
@Mapper
public interface HomeSubjectMapper extends BaseMapper<HomeSubjectEntity> {
	
}
