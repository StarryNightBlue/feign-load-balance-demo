package com.feign.load.balance.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author YanQiQi
 * @Date 2020-03-10 16:33
 **/
@FeignClient(value = "service-hi")
public interface ScheduleServiceHi {

    /**
     * sayHiFromClientOne
     *
     * @param name name
     * @return String
     */
    @GetMapping(value = "/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
