package com.cos.photogramstart.handler;

import com.cos.photogramstart.handler.ex.CustomVaildationApiException;
import com.cos.photogramstart.handler.ex.CustomVaildationException;
import com.cos.photogramstart.utill.Script;
import com.cos.photogramstart.web.dto.auth.dto.CMRespDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@ControllerAdvice
public class ControllExceptionHandler {

    @ExceptionHandler(CustomVaildationException.class)
    public String vaildationExcepion(CustomVaildationException e) {

        return Script.back(e.getErrorMap().toString());
    }

    @ExceptionHandler(CustomVaildationApiException.class)
    public ResponseEntity<?> vaildationApiExcepion(CustomVaildationApiException e) {

        return new ResponseEntity<>(new CMRespDto<>(-1,e.getMessage(), e.getErrorMap()), HttpStatus.BAD_REQUEST) ;
    }
}
