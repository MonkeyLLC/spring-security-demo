package com.llc.spring_security_demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.llc.spring_security_demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}