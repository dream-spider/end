package com.spider.end.common.mongo.model.article;

import java.util.Date;
import java.util.List;

import com.spider.end.common.enums.ArticleStates;
import com.spider.end.common.mongo.model.Extend;
import com.spider.end.common.mongo.model.Tag;

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

@Document(collection = "Article")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Article {

  @Id
  String id;

  @Field
  String title;

  @Field
  String content;

  @Field
  String thumbnail;

  @Field
  ArticleStates state;

  @CreatedDate
  private Date createdAt;

  @LastModifiedDate
  private Date updatedAt;

  @Field
  private String createdBy;

  @Field
  private String updatedBy;

  @Field
  private Meta meta;

  @Field
  private String[] keywords;

  @Field
  private List<Extend> extendList;

  @DBRef
  private List<Tag> relatedTags;
}