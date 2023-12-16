package com.cos.photogramstart.handler.ex;

import java.util.Map;

public class CustomVaildationApiException extends RuntimeException{

    private static final long serialVersionUID =1L;

   // private String message;
    private Map<String, String> errorMap;

    public Map<String, String> getErrorMap() {
        return errorMap;
    }

    public CustomVaildationApiException(String message) {
        super(message);
        // this.message = message;
    }

    public CustomVaildationApiException(String message, Map<String,String> errorMap) {
        super(message);
    // this.message = message;
     this.errorMap = errorMap;


    }
}
