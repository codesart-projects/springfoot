package com.example.demo;

import com.example.demo.service.DemoUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DemoApplicationTest {

    @Autowired
    private DemoUserService demoUserService;

    @Test
    void contextLoads() {

    }

}