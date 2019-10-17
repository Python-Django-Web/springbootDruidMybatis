package com.example.web.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.web.entity.User;
import com.example.web.mapper.UserMapper;
import com.example.web.service.UserService;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

	@Override
	public User getUser(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getList() {
		// TODO Auto-generated method stub
		return null;
	}


}
