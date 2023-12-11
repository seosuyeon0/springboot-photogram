package com.cos.photogramstart.handler.ex;

import lombok.Data;

import java.util.Map;

public class CustomVaildationException extends RuntimeException{

    private static final long serialVersionUID =1L;

   // private String message;
    private Map<String, String> errorMap;

    public Map<String, String> getErrorMap() {
        return errorMap;
    }

    public CustomVaildationException(String message, Map<String,String> errorMap) {
        super(message);
    // this.message = message;
     this.errorMap = errorMap;


    }
}
