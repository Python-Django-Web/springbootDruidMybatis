package com.example.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.example.web.entity.User;
import com.example.web.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api
@RestController
@RequestMapping(value = "User")
public class UserController {


	@Autowired
	UserService userService;
	
	@ApiOperation("添加用户")
	@PostMapping("/add")
	public String add(@RequestBody User user) {
		return userService.insert(user)?"success":"faill";
	}
	
	@ApiOperation("查询用户")
	@PostMapping("/list")
	public  List<User> list(){
		Wrapper<User> wrapper = new EntityWrapper<User>();
		return userService.selectList(wrapper);
	}
}
