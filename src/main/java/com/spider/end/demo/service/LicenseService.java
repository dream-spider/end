package com.spider.end.demo.service;


import com.spider.end.demo.pojo.License;

import java.util.List;

/**
 * @ClassName LicenseService
 * @Description 授权码接口
 * @Author jiaoqx
 * @Date 2019/12/13 11:07
 * @Version 1.0
 */
public interface LicenseService {
    /**
     * 生成授权码
     * @param number
     * @return
     */
    String[] generateLicense(int number);

    /**
     * 查询授权码列表
     * @return
     */
    List<License> queryLicense();
}
