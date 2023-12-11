package com.cos.photogramstart.web.dto.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CMRespDto<T> {

    private int code; //1성공 -1실패
    private String message;
    private T date;

}
