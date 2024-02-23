package com.llc.spring_security_demo.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;
import java.util.Date;

@Getter
@Setter
public class AuthUser extends User {
    private Long id;

    @Schema(name = "username", description = "用户名",example = "admin")
    private String username;

    @Schema(name = "password", description = "密码",example = "123456")
    private String phone;

    private String wechatUnionId;

    /**
     * 登录次数
     */
    private Integer timesLogin = 0;

    private Date expireAt;

    public AuthUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public AuthUser(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }
}
