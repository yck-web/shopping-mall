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
 * 品牌
 * </p>
 *
 * @author testjava
 * @since 2022-02-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="PmsBrand对象", description="品牌")
public class PmsBrand implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "品牌id")
    @TableId(value = "brand_id", type = IdType.AUTO)
    private Long brandId;

    @ApiModelProperty(value = "品牌名")
    private String name;

    @ApiModelProperty(value = "品牌logo地址")
    private String logo;

    @ApiModelProperty(value = "介绍")
    private String descript;

    @ApiModelProperty(value = "显示状态[0-不显示；1-显示]")
    private Integer showStatus;

    @ApiModelProperty(value = "检索首字母")
    private String firstLetter;

    @ApiModelProperty(value = "排序")
    private Integer sort;


}
