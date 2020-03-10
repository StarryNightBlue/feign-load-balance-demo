package com.service.hi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author YanQiQi
 * @Date 2020-03-10 17:15
 **/
@Component
public class MyConfig {

    @Value("${server.port}")
    private String port;

    /**
     * 获取端口
     *
     * @return port
     */
    public String getPort() {
        return this.port;
    }
}
