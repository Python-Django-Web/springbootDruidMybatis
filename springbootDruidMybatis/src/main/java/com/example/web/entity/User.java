package com.example.web.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Api("用户实体")
@Data
@TableName("user")
public class User {
	
	@ApiModelProperty("用户id")
	@TableId(type = IdType.AUTO)
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