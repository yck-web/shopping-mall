package com.atguigu.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
 * 仓库信息
 * </p>
 *
 * @author testjava
 * @since 2022-02-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("wms_ware_info")
@ApiModel(value="WmsWareInfo对象", description="仓库信息")
public class WmsWareInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "仓库名")
    private String name;

    @ApiModelProperty(value = "仓库地址")
    private String address;

    @ApiModelProperty(value = "区域编码")
    private String areacode;


}
