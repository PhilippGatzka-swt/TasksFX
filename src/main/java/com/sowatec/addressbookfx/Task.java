package com.sowatec.addressbookfx;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
//import org.json.simple.JSONObject;

public class Task implements Serializable {

  private long id;
  private String name;
  private Date createDate;
  private Date targetDate;
  private String description;

  public Task(String name, Date targetDate, String description) {
    this.id = DataManager.generateId();
    this.name = name;
    this.createDate = new Date();
    this.targetDate = targetDate;
    this.description = description;
  }

  private Task(long id) {
    this.id = id;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  public Date getTargetDate() {
    return targetDate;
  }

  public void setTargetDate(Date targetDate) {
    this.targetDate = targetDate;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return name;
  }
}
