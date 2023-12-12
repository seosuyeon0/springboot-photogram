package com.cos.photogramstart.web;

import com.cos.photogramstart.config.auth.PrincipalDetails;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {

    @GetMapping("/user/{id}")
    public String profile(@PathVariable int id) {
        return "user/profile";
    }

    @GetMapping("/user/{id}/update")
    public String update(@PathVariable int id,  @AuthenticationPrincipal PrincipalDetails principalDetails) {
        // 1  AuthenticationPrincipal 어노테이션 사용방법 : 추천
        System.out.println("principalDetails.getUser() = " + principalDetails.getUser());
        // 2. 어노테이션 없이 : 비추천
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        System.out.println("auth.getPrincipal() = " + auth.getPrincipal());
        return "user/update" ;
    }
}
