package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 属性分组
 * </p>
 *
 * @author testjava
 * @since 2022-02-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="PmsAttrGroup对象", description="属性分组")
public class PmsAttrGroup implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "分组id")
    @TableId(value = "attr_group_id", type = IdType.AUTO)
    private Long attrGroupId;

    @ApiModelProperty(value = "组名")
    private String attrGroupName;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    @ApiModelProperty(value = "描述")
    private String descript;

    @ApiModelProperty(value = "组图标")
    private String icon;

    @ApiModelProperty(value = "所属分类id")
    private Long catelogId;


}
