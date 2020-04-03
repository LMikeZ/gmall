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

import com.atguigu.gmall.oms.entity.OmsOrderReturnApplyEntity;
import com.atguigu.gmall.oms.service.OmsOrderReturnApplyService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.ResponseVo;
import com.atguigu.gmall.common.bean.PageParamVo;

/**
 * 订单退货申请
 *
 * @author lz
 * @email 1264408878@qq.com
 * @date 2020-03-31 21:41:33
 */
@Api(tags = "订单退货申请 管理")
@RestController
@RequestMapping("oms/omsorderreturnapply")
public class OmsOrderReturnApplyController {

    @Autowired
    private OmsOrderReturnApplyService omsOrderReturnApplyService;

    /**
     * 列表
     */
    @GetMapping
    @ApiOperation("分页查询")
    public ResponseVo<PageResultVo> list(PageParamVo paramVo){
        PageResultVo pageResultVo = omsOrderReturnApplyService.queryPage(paramVo);

        return ResponseVo.ok(pageResultVo);
    }


    /**
     * 信息
     */
    @GetMapping("{id}")
    @ApiOperation("详情查询")
    public ResponseVo<OmsOrderReturnApplyEntity> queryOmsOrderReturnApplyById(@PathVariable("id") Long id){
		OmsOrderReturnApplyEntity omsOrderReturnApply = omsOrderReturnApplyService.getById(id);

        return ResponseVo.ok(omsOrderReturnApply);
    }

    /**
     * 保存
     */
    @PostMapping
    @ApiOperation("保存")
    public ResponseVo<Object> save(@RequestBody OmsOrderReturnApplyEntity omsOrderReturnApply){
		omsOrderReturnApplyService.save(omsOrderReturnApply);

        return ResponseVo.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    @ApiOperation("修改")
    public ResponseVo update(@RequestBody OmsOrderReturnApplyEntity omsOrderReturnApply){
		omsOrderReturnApplyService.updateById(omsOrderReturnApply);

        return ResponseVo.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    @ApiOperation("删除")
    public ResponseVo delete(@RequestBody List<Long> ids){
		omsOrderReturnApplyService.removeByIds(ids);

        return ResponseVo.ok();
    }

}
