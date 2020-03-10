package com.service.hi.controller;

import com.service.hi.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author YanQiQi
 * @Date 2020-03-10 17:14
 **/
@RestController
public class HiController {

    @Autowired
    private MyConfig myConfig;


    @GetMapping("/hi")
    public String sayHi(@RequestParam String name) {
        return "hi " + name + " your ip.port is " + myConfig.getPort();
    }
}
