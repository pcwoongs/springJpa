package com.jpa.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // JSON을 반환하는 Controller를 만들어 준다.
public class HelloController {

    @GetMapping("/hello") // Http Method인 Get의 요청을 받을 수 있는 API를 생성한다.
    public String hello() {
        return "hello";
    }
}