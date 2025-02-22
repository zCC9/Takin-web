package io.shulie.takin.web.biz.pojo.request.pradar;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("pradar配置新增")
public class PradarZKConfigCreateRequest {
    //@ApiModelProperty("配置ID")
    //private Long id;

    @ApiModelProperty("配置路径")
    private String zkPath;

    @ApiModelProperty("值类型:[String,Int,Boolean]")
    private String type;

    @ApiModelProperty("配置值")
    private String value;

    @ApiModelProperty("配置说明")
    private String remark;
}
