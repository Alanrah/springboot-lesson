package com.yaru.lesson.controller;

import com.yaru.lesson.pojo.dto.UserDto;
import com.yaru.lesson.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// dto用来接收这张表以外的字段，连表的时候不破坏表原有的数据结构
@RestController // 接口方法返回对象，对象转换为json
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService;

    // create
    @PostMapping // method: post
    public String add(@RequestBody UserDto user) {  // RequestBody 会自动将传入的json文本转换为对象
        userService.add(user);
        return "success";
    }


    // delete
//    @DeleteMapping

    // update
//    @PutMapping

    // search
//    @GetMapping

}
