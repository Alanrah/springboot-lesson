package com.yaru.lesson.service;

import com.yaru.lesson.pojo.User;
import com.yaru.lesson.pojo.dto.UserDto;

public interface IUserService {
    User add(UserDto user);
}
