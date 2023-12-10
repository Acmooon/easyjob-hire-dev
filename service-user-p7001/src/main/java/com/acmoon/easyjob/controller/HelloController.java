package com.acmoon.easyjob.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acmoon.easyjob.grace.result.GraceJSONResult;
import com.acmoon.easyjob.grace.result.ResponseStatusEnum;
import com.acmoon.easyjob.pojo.test.Stu;
import com.acmoon.easyjob.service.StuService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("user")
@Slf4j
public class HelloController {

    @GetMapping("hello")
    public Object hello() {

        Stu stu = new Stu();

        // System.out.println(stu.toString());
        log.info("info: " + stu.toString());
        log.debug("debug: " + stu.toString());
        log.warn("warn: " + stu.toString());
        log.error("error: {}", stu.toString());

        return "Hello User Service~";
    }

    @GetMapping("hello2")
    public Object hello2() {

        Stu stu = new Stu(1001, "easyjob", 18);

        // return GraceJSONResult.ok(stu);
        // return IMOOCJSONResult.ok("添加成功！");
        // return IMOOCJSONResult.errorMsg("修改出错，请联系管理员");
        // return IMOOCJSONResult.errorMap(map)
        return GraceJSONResult.errorCustom(ResponseStatusEnum.SYSTEM_IO);
        
    }

    @Autowired
    private StuService stuService;

    @GetMapping("stu")
    public Object getStu() {
        
        com.acmoon.easyjob.pojo.Stu stu = new com.acmoon.easyjob.pojo.Stu();
        // stu.setId(1001); // 使用assign_id 不需要自行设置id
        stu.setAge(22);
        stu.setName("hzr");

        stuService.save(stu);

        return GraceJSONResult.ok(stu);

    }
}   
