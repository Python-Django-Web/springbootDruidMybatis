package com.example.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.IService;
import com.example.web.entity.User;
@Service
public interface UserService extends IService<User>{

	User getUser(Integer id);
	
	List<User> getList();
}
