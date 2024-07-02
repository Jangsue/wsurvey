package com.woongjin.pjt.wsurveyweb;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
    @Value("${common.common.key}")
    private String commonComonKey;

    @Value("${common.key}")
    private String comonKey;

    @Value("${local.local.key}")
    private String localLocalKey;

    @Value("${local.key}")
    private String localKey;

    @RequestMapping("/test")
    public String test() {
        return commonComonKey +" | "+ comonKey +" | "+ localLocalKey  +" | "+ localKey;
    }
}
