package com.spider.end.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/**
 * @ClassName License
 * @Description 授权码
 * @Author jiaoqx
 * @Date 2019/12/13 10:50
 * @Version 1.0
 */
@Data
@Document(collection = "License")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class License {
    @Id
    private String id;
    @Field
    private String licenseCode;
    @Field
    private String macAddress;
    @Field
    private String state;
    @Field
    private Date createTime;
    @Field
    private Date activeTime;
    @Field
    private String activeBy;
}
