package com.spider.end.common.enums;

public enum ArticleStates {
  DRAFT(0), PUBLISHED(1);

  private int value;

  private ArticleStates (int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  public void setValue(int value) {
    this.value = value;
  }
}