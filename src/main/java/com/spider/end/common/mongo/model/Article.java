package com.spider.end.common.mongo.model;

import com.spider.end.common.enums.ArticleStates;

import org.springframework.data.annotation.Id;
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
  // title: String,
  // content: String,
  // thumbnail: { type: String, default: '' },
  // state: { type: Number, default: ARTICLE_STATES.DRAFTED },
  // created_at: { type: Date, default: Date.now },
  // updated_at: { type: Date, default: Date.now },
  // meta: {
  //   likes: { type: Number, default: 0 },
  //   views: { type: Number, default: 0 },
  //   comments: {type: [{ 
  //     email: { type: String },
  //     name: {type: String }, 
  //     message: {type: String },
  //   }], default: []}
  // },
  // keywords: {type: [String], default: []},
  // extends: [{type: ExtendSchema, default: []}],
  // related_tags: [{type: Schema.Types.ObjectId, ref: 'Tag'}]
}