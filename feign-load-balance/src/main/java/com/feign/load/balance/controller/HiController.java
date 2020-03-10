package com.feign.load.balance.controller;

import com.feign.load.balance.feign.ScheduleServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author YanQiQi
 * @Date 2020-03-10 16:28
 **/
@RestController
public class HiController {

    @Autowired
    private ScheduleServiceHi scheduleServiceHi;

    @GetMapping("/hello")
    public String sayHello(@RequestParam String name) {
        return scheduleServiceHi.sayHiFromClientOne(name);
    }
}
