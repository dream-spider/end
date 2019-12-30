package com.spider.end.demo.controller;

import com.spider.end.demo.pojo.ResponseObj;
import com.spider.end.demo.service.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DemoController
 * @Description TODO
 * @Author jiaoqx
 * @Date 2019/12/24 15:33
 * @Version 1.0
 */
@RestController
public class DemoController {
    @Autowired
    LicenseService licenseService;
    @GetMapping("/hello")
    public ResponseObj hello(){
        return ResponseObj.success(licenseService.queryLicense());
    }

    @GetMapping("/jesus")
    public String jesus(){
        return "123";
    }
}
