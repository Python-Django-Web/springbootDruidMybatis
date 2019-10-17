package com.example.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.web.entity.User;

@Mapper
public interface UserMapper extends BaseMapper<User>{

	User getUser(Integer id);
	
	List<User> getList();
}
