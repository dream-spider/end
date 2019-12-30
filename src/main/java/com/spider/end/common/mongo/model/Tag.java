package com.spider.end.common.mongo.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "Tag")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Tag {
  @Id
  private String id;

  @Field
  private String name;

  @Field
  private String description;

  @Field
  private int state;

  @Field
  private String createdBy;

  @Field
  private String updatedBy;

  @CreatedDate
  private Date createdAt;

  @LastModifiedDate
  private Date updatedAt;

  @DBRef()
  private List<Extend> extendList;

  @DBRef()
  private String related_articles;

  
}