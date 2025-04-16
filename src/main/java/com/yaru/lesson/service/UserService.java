package com.yaru.lesson.service;

import com.yaru.lesson.pojo.User;
import com.yaru.lesson.pojo.dto.UserDto;
import com.yaru.lesson.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// 使用@Service注解，Spring会自动将UserService的实例注入到需要IUserService的地方
@Service
public class UserService implements IUserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public User add(UserDto user) {
         // 调用数据访问类
        User userPojo = new User();
        BeanUtils.copyProperties(user, userPojo);
        return userRepository.save(userPojo);
    }

    @Override
    public User getUser(Integer userId) {
        // user有可能不存在，需要处理异常
        return userRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("用户不存在，参数异常"));
    }

    @Override
    public User editUser(UserDto user) {
        User userPojo = new User();
        BeanUtils.copyProperties(user, userPojo);
        return userRepository.save(userPojo);
    }
}
