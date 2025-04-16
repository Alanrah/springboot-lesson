package com.yaru.lesson.exception;

import com.yaru.lesson.pojo.ResponseMessage;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


// 异常统一处理
@RestControllerAdvice
public class GlobalExceptionHandlerAdvice {

    // 记录错误日志
    Logger log = LoggerFactory.getLogger(GlobalExceptionHandlerAdvice.class);

    @ExceptionHandler({Exception.class}) // 所有class的错误类型统一处理
    public ResponseMessage HandlerException(Exception e, HttpServletRequest request, HttpServletResponse response) {
        log.error("统一异常 ",e);
        return new ResponseMessage(500, "error", null);

    }
}
