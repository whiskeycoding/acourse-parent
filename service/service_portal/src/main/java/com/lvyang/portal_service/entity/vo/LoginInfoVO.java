package com.lvyang.portal_service.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: lvyang
 * @Description:
 * @Date: 2021/1/20 10:59
 * @Version: 1.0
 */
@Data
@ApiModel(value="登录对象信息", description="登录对象信息")
public class LoginInfoVO {
    @ApiModelProperty(value = "用户名昵称")
    private String nickname;

    @ApiModelProperty(value = "手机号")
    private String mobile;

    @ApiModelProperty(value = "性别 1 女，2 男")
    private Integer sex;

    @ApiModelProperty(value = "年龄")
    private Integer age;

    @ApiModelProperty(value = "用户头像")
    private String avatar;

    @ApiModelProperty(value = "用户签名")
    private String sign;

}
