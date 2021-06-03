package com.jpa.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // Spring boot의 자동 설정, String Bean 읽기와 성생을 모두 자동으로 설정함. 프로젝트의 최상단에 위치해야만 한다.

// Application Class는 앞으로 만들어질 이 Project의 Main Class로 사용됨.
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);  //내 내장 WAS를 실행함. 서버에 톱캣을 설치할 필요가 없고, Spring boot로 만들어진 Jar File을 실행하면 된다.
    }
}
