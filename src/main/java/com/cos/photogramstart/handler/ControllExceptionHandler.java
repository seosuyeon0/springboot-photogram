package com.cos.photogramstart.handler;

import com.cos.photogramstart.handler.ex.CustomVaildationException;
import com.cos.photogramstart.utill.Script;
import com.cos.photogramstart.web.dto.auth.dto.CMRespDto;
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

}
