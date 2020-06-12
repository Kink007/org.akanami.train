package org.akanami.springboot.global;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler(Exception.class)
    public String handleOtherException(HttpServletRequest request, Throwable ex) {
        return "全局异常处理";
    }
}
