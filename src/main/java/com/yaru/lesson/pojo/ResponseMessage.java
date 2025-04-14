package com.yaru.lesson.pojo;

import org.springframework.http.HttpStatus;

public class ResponseMessage<T> {
    private int code;       // 状态码
    private String message; // 响应消息
    private T data;         // 泛型数据载体


    // 无参构造器（框架/反射需要）
    public ResponseMessage() {
    }

    // 全参构造器（快速创建对象）
    public ResponseMessage(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public static<T> ResponseMessage<T> success(T data) {
        return new ResponseMessage<>(HttpStatus.OK.value(), "请求成功", data );
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
