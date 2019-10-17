package com.example.web.vo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("用户Vo")
public class UserVo {

	@ApiModelProperty("用户id")
	private Integer id;
	@ApiModelProperty("用户名")
	private String name;
	@ApiModelProperty("用户账号")
	private String accounts;
	@ApiModelProperty("密码")
	private String password;
	@ApiModelProperty("邮箱")
	private String email;
	
}
