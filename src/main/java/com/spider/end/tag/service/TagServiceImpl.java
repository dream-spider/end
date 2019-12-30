package com.spider.end.tag.service;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import com.spider.end.common.mongo.model.Tag;
import com.spider.end.common.mongo.model.article.Article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

@Service
public class TagServiceImpl implements TagService {

  @Autowired
  private MongoTemplate mongoTemplate;

  @Override
  public List<Tag> test() {
    // List<Tag> results = mongoTemplate.find(Query.query(Criteria.where("name").is("JavaScript")), Tag.class, "tags");

    // results.stream().map((Tag t) -> new HashMap<String, List<Article>>(){{
    //   put(t.getId(), t.getRelatedArticles());
    // }});

    return mongoTemplate.findAll(Tag.class, "tags");
  }
}