package com.spider.end.demo.service;

import com.spider.end.demo.pojo.License;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @ClassName LicenseServiceImpl
 * @Description TODO
 * @Author jiaoqx
 * @Date 2019/12/13 11:14
 * @Version 1.0
 */
@Service
public class LicenseServiceImpl implements LicenseService {
    @Autowired
    MongoTemplate mongoTemplate;

    @Value("${license.encryptKey}")
    String encryptKey;

    @Override
    public String[] generateLicense(int number) {
        String[] codes = new String[number];
        return codes;
        // String[] codes = new String[number];
        // List<License> licenses = new ArrayList<>(number);
        // for (int i = 0; i < number; i++) {
        //     License license = new License();
        //     license.setLicenseCode(UUID.randomUUID().toString());
        //     license.setCreateTime(new Date());
        //     codes[i] = license.getLicenseCode();
        //     licenses.add(license);
        // }
        // mongoTemplate.insertAll(licenses);
        // return codes;
    }


    @Override
    public List<License> queryLicense() {
        return mongoTemplate.findAll(License.class);
    }
}
