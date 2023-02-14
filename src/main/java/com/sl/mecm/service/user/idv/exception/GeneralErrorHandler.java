package com.sl.mecm.user.service.idv.exception;


import com.alibaba.fastjson2.JSONObject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GeneralErrorHandler {

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<JSONObject> acceptGeneralError(Throwable throwable){
        JSONObject responseBody = new JSONObject().fluentPut("code", "500").fluentPut("messaage", throwable.getLocalizedMessage());
        return new ResponseEntity<>(responseBody, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
