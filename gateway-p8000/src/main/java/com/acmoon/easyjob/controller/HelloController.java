package com.acmoon.easyjob.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("gateway")
@Slf4j
public class HelloController {

    @GetMapping("hello")
    public Object hello() {

        return "Hello Gateway~";
    }
}
