package com.spider.end.tag.service;

import java.util.List;

import com.spider.end.common.mongo.model.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class TagServiceImpl implements TagService {

  @Autowired
  private MongoTemplate mongoTemplate;

  @Override
  public List<Tag> test() {
    return mongoTemplate.findAll(Tag.class, "tags");
  }
}