package com.spider.end.common.mongo.model.article;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Meta {
  public int likes;
  public int views;
  public List<Comment> comments;
}