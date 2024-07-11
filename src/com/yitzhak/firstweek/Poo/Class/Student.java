package com.yitzhak.firstweek.Poo.Class;

import com.yitzhak.firstweek.Poo.DTO.StudentDTO;

public class Student implements StudentDTO {
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