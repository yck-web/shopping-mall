package com.atguigu.gulimall.order.entity;

import java.math.BigDecimal;
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
 * 支付信息表
 * </p>
 *
 * @author testjava
 * @since 2022-02-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="OmsPaymentInfo对象", description="支付信息表")
public class OmsPaymentInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "订单号（对外业务号）")
    private String orderSn;

    @ApiModelProperty(value = "订单id")
    private Long orderId;

    @ApiModelProperty(value = "支付宝交易流水号")
    private String alipayTradeNo;

    @ApiModelProperty(value = "支付总金额")
    private BigDecimal totalAmount;

    @ApiModelProperty(value = "交易内容")
    private String subject;

    @ApiModelProperty(value = "支付状态")
    private String paymentStatus;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "确认时间")
    private Date confirmTime;

    @ApiModelProperty(value = "回调内容")
    private String callbackContent;

    @ApiModelProperty(value = "回调时间")
    private Date callbackTime;


}
