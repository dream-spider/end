package com.spider.end.demo.service;

import com.spider.end.demo.pojo.License;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

@SpringBootTest
class LicenseServiceImplTest {
    @Autowired
    LicenseService licenseService;
    @Test
    void generateLicense() {
        licenseService.generateLicense(5);
    }
    @Autowired
    MongoTemplate mongoTemplate;
    @Test
    void queryLicense() {
        List<License> licenseList = mongoTemplate.find(Query.query(Criteria.where("macAddress").ne("").ne(null)), License.class);
        for(License license:licenseList){
            System.out.println(license.getLicenseCode());
        }
    }
}