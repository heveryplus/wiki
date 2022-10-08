package com.hevery.wiki.controller;

import com.hevery.wiki.domain.Test;
import com.hevery.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: description
 * @author: hevery
 * @date: 2022/10/8
 */

@RestController
public class TestController {

    @Resource
    private TestService testService;

    @Value("${test.hello:TEST}")
    private String testHello;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!" + testHello;
    }

    @PostMapping("/hello/post")
    public String hello(String name) {
        return "Hello World!" + name;
    }

    @GetMapping("/test/list")
    public List<Test> list() {
        return testService.list();
    }
}
