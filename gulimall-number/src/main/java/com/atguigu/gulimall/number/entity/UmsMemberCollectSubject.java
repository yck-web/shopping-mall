package com.atguigu.gulimall.number.entity;

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
 * 会员收藏的专题活动
 * </p>
 *
 * @author testjava
 * @since 2022-02-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="UmsMemberCollectSubject对象", description="会员收藏的专题活动")
public class UmsMemberCollectSubject implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "subject_id")
    private Long subjectId;

    @ApiModelProperty(value = "subject_name")
    private String subjectName;

    @ApiModelProperty(value = "subject_img")
    private String subjectImg;

    @ApiModelProperty(value = "活动url")
    private String subjectUrll;


}
