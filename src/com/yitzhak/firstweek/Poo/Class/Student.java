package com.yitzhak.firstweek.Poo.Class;

import com.yitzhak.firstweek.Poo.PDO.StudentPDO;

public class Student implements StudentPDO {
  private String name;
  private int age;
  private String sex;

  public Student(String name, int age, String sex) {
    this.name = name;
    this.age = age;
    this.sex = sex;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getSex() {
    return sex;
  }
}