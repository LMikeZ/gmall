package com.atguigu.gmall.oms.controller;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.gmall.oms.entity.OmsOrderReturnReasonEntity;
import com.atguigu.gmall.oms.service.OmsOrderReturnReasonService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.ResponseVo;
import com.atguigu.gmall.common.bean.PageParamVo;

/**
 * 退货原因
 *
 * @author lz
 * @email 1264408878@qq.com
 * @date 2020-03-31 21:41:33
 */
@Api(tags = "退货原因 管理")
@RestController
@RequestMapping("oms/omsorderreturnreason")
public class OmsOrderReturnReasonController {

    @Autowired
    private OmsOrderReturnReasonService omsOrderReturnReasonService;

    /**
     * 列表
     */
    @GetMapping
    @ApiOperation("分页查询")
    public ResponseVo<PageResultVo> list(PageParamVo paramVo){
        PageResultVo pageResultVo = omsOrderReturnReasonService.queryPage(paramVo);

        return ResponseVo.ok(pageResultVo);
    }


    /**
     * 信息
     */
    @GetMapping("{id}")
    @ApiOperation("详情查询")
    public ResponseVo<OmsOrderReturnReasonEntity> queryOmsOrderReturnReasonById(@PathVariable("id") Long id){
		OmsOrderReturnReasonEntity omsOrderReturnReason = omsOrderReturnReasonService.getById(id);

        return ResponseVo.ok(omsOrderReturnReason);
    }

    /**
     * 保存
     */
    @PostMapping
    @ApiOperation("保存")
    public ResponseVo<Object> save(@RequestBody OmsOrderReturnReasonEntity omsOrderReturnReason){
		omsOrderReturnReasonService.save(omsOrderReturnReason);

        return ResponseVo.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    @ApiOperation("修改")
    public ResponseVo update(@RequestBody OmsOrderReturnReasonEntity omsOrderReturnReason){
		omsOrderReturnReasonService.updateById(omsOrderReturnReason);

        return ResponseVo.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    @ApiOperation("删除")
    public ResponseVo delete(@RequestBody List<Long> ids){
		omsOrderReturnReasonService.removeByIds(ids);

        return ResponseVo.ok();
    }

}
