package com.atguigu.gulimall.order.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 订单退货申请
 * </p>
 *
 * @author testjava
 * @since 2022-02-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("oms_order_return_apply")
@ApiModel(value="OmsOrderReturnApply对象", description="订单退货申请")
public class OmsOrderReturnApply implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "order_id")
    private Long orderId;

    @ApiModelProperty(value = "退货商品id")
    private Long skuId;

    @ApiModelProperty(value = "订单编号")
    private String orderSn;

    @ApiModelProperty(value = "申请时间")
    private Date createTime;

    @ApiModelProperty(value = "会员用户名")
    private String memberUsername;

    @ApiModelProperty(value = "退款金额")
    private BigDecimal returnAmount;

    @ApiModelProperty(value = "退货人姓名")
    private String returnName;

    @ApiModelProperty(value = "退货人电话")
    private String returnPhone;

    @ApiModelProperty(value = "申请状态[0->待处理；1->退货中；2->已完成；3->已拒绝]")
    private Boolean status;

    @ApiModelProperty(value = "处理时间")
    private Date handleTime;

    @ApiModelProperty(value = "商品图片")
    private String skuImg;

    @ApiModelProperty(value = "商品名称")
    private String skuName;

    @ApiModelProperty(value = "商品品牌")
    private String skuBrand;

    @ApiModelProperty(value = "商品销售属性(JSON)")
    private String skuAttrsVals;

    @ApiModelProperty(value = "退货数量")
    private Integer skuCount;

    @ApiModelProperty(value = "商品单价")
    private BigDecimal skuPrice;

    @ApiModelProperty(value = "商品实际支付单价")
    private BigDecimal skuRealPrice;

    @ApiModelProperty(value = "原因")
    private String reason;

    @ApiModelProperty(value = "描述")
    private String description述;

    @ApiModelProperty(value = "凭证图片，以逗号隔开")
    private String descPics;

    @ApiModelProperty(value = "处理备注")
    private String handleNote;

    @ApiModelProperty(value = "处理人员")
    private String handleMan;

    @ApiModelProperty(value = "收货人")
    private String receiveMan;

    @ApiModelProperty(value = "收货时间")
    private Date receiveTime;

    @ApiModelProperty(value = "收货备注")
    private String receiveNote;

    @ApiModelProperty(value = "收货电话")
    private String receivePhone;

    @ApiModelProperty(value = "公司收货地址")
    private String companyAddress;


}
