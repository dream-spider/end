package com.spider.end.common.mongo.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "Extend")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Extend {
  @Field
  String key;

  @Field
  String value;
}