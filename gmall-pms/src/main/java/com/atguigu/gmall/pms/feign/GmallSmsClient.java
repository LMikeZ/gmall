package com.atguigu.gmall.pms.feign;

import com.atguigu.gmall.common.bean.ResponseVo;
import com.atguigu.gmall.pms.Vo.SaleVo;
import com.atguigu.gmall.sms.api.GmallSmsApi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Classname GmallSmsClient
 * @Description TODO
 * @Date 2020/4/5 16:00
 * @Created by li
 */
@FeignClient("sms-service")
public interface GmallSmsClient extends GmallSmsApi {

}
