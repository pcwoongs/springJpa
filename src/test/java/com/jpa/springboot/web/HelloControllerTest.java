package com.jpa.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class) // 테스트를 진행할 때 Junit에 내장된 실행자 외에 다른 실행자 ( SpringRunner)를 실행시킨다. ( Spring boot test와 Junit 사이의 연결자 역할을 수행함. )
@WebMvcTest(controllers = HelloController.class) // Controller, ControllerAdvice 등을 사용하기 위한 Annotation.
public class HelloControllerTest {

        @Autowired // 스프링이 관리하는 Bean을 주입받습니다.
        private MockMvc mvc; // 웹 API를 테스트할 때 사용 ( 스프링 MVC 테스트의 시작점이며, 이 클래스를 통해 HTTP GET, POST 등에 대한 API 테스트를 할 수 있다.)

        @Test
        public void hello가_리턴된다() throws Exception {
                String hello = "hello";

                mvc.perform(get("/hello")).andExpect(status().isOk()).andExpect(content().string(hello));

        }
}