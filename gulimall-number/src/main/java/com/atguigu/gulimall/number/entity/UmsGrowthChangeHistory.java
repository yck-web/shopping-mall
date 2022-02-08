package com.atguigu.gulimall.number.entity;

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
 * 成长值变化历史记录
 * </p>
 *
 * @author testjava
 * @since 2022-02-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="UmsGrowthChangeHistory对象", description="成长值变化历史记录")
public class UmsGrowthChangeHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "member_id")
    private Long memberId;

    @ApiModelProperty(value = "create_time")
    private Date createTime;

    @ApiModelProperty(value = "改变的值（正负计数）")
    private Integer changeCount;

    @ApiModelProperty(value = "备注")
    private String note;

    @ApiModelProperty(value = "积分来源[0-购物，1-管理员修改]")
    private Integer sourceType;


}
