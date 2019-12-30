package com.spider.end.tag.controller;

import java.util.List;

import com.spider.end.common.mongo.model.Tag;
import com.spider.end.tag.service.TagService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tag")
public class TagController {

  @Autowired
  TagService tagService;

  @GetMapping("/")
  public List<Tag> hello(){
    return tagService.test();
  }
}