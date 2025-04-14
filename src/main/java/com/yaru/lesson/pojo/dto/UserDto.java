package com.yaru.lesson.pojo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;

// DTO用于在不同层之间传输数据
// 通常用于将业务逻辑层（Service层）的数据传输给表示层（Presentation层）或持久化层（Persistence层）
public class UserDto {
    // 依赖于 spring-boot-starter-validation
     @NotBlank(message = "用户名不能为空") // 去除空格
     @NotEmpty
    private String userName;
    @NotBlank(message = "密码不能为空")
    @Length(min = 6, max = 12)
    private String password;
    @Pattern(regexp = "^1[3-9]\\d{9}$", message = "手机号格式不正确")
    private String mobile;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
