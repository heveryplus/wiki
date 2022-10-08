package com.hevery.wiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @description: description
 * @author: hevery
 * @date: 2022/10/8
 */

@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @PostMapping("/hello/post")
    public String hello(String name) {
        return "Hello World!" + name;
    }


}
