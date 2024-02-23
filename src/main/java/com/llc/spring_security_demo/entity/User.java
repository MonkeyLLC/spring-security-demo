package com.llc.spring_security_demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;



@Getter
@Setter
@TableName("user")
public class User{

    @TableId(type = IdType.AUTO)
    private Long id;

    @Schema(name = "username", description = "用户名",example = "admin")
    private String username;

    @Schema(name = "password", description = "密码",example = "123456")
    private String password;

    private String phone;

    private String wechatUnionId;

    /**
     * 登录次数
     */
    private Integer timesLogin = 0;

    private Date expireAt;

    private Date createdAt;

    private Date updatedAt;

}
