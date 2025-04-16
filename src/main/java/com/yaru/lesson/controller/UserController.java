package com.yaru.lesson.controller;

import com.yaru.lesson.pojo.ResponseMessage;
import com.yaru.lesson.pojo.User;
import com.yaru.lesson.pojo.dto.UserDto;
import com.yaru.lesson.service.IUserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// dto用来接收这张表以外的字段，连表的时候不破坏表原有的数据结构
@RestController // 接口方法返回对象，对象转换为json
@RequestMapping("/user")
public class UserController {
    //自动装配，@Autowired是Spring框架中的一个注解，表示自动装配。当一个Java类被注入到Spring容器中时
    // 如果在这个类中使用@Autowired注解，则Spring容器会自动扫描所有的对象，找到与该属性或构造器参数类型匹配的对象，
    // 并将其注入到该属性或构造器参数中。

    @Autowired
    IUserService userService;

    // create
    @PostMapping // method: post
    public ResponseMessage<User> add(@Valid @RequestBody UserDto user) {  //  Valid 触发dto的校验，RequestBody 会自动将传入的json文本转换为对象
        User res =  userService.add(user);
        return ResponseMessage.success(res);
    }

    // search
    @GetMapping("/{userId}")
    public ResponseMessage<User> getUser(@PathVariable Integer userId) {  //  Valid 触发dto的校验，RequestBody 会自动将传入的json文本转换为对象
        User res =  userService.getUser(userId);
        return ResponseMessage.success(res);
    }

    // update
    @PutMapping
    public ResponseMessage<User> edit(@Valid @RequestBody UserDto user) {
        User res = userService.editUser(user);
        return ResponseMessage.success(res);
    }
    // delete
//    @DeleteMapping
}
