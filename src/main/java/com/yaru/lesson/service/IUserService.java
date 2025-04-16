package com.yaru.lesson.service;

import com.yaru.lesson.pojo.User;
import com.yaru.lesson.pojo.dto.UserDto;

public interface IUserService {
    User add(UserDto user);
    //    查询用户
    User getUser(Integer userId);
    // 删除用户
    void delUser (Integer userId);
    // 编辑用户
    User editUser(UserDto user);
}
