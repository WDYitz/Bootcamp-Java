package com.yitzhak.firstweek.Poo.Class;

public class School {
  private String name;
  private int yearOfFoundation;
  private Object[] students;

  public School(String name, int yearOfFoundation, Object[] students) {
    this.name = name;
    this.yearOfFoundation = yearOfFoundation;
    this.students = students;
  }

  public String getSchoolName() {
    return name;
  }

  public Object[] getStudents() {
    return students;
  }

  public String getStudentName(String name) {
    for (Object student : students) {
      if (((Student) student).getName().equals(name)) {
        return ((Student) student).getName();
      }
    }
    return "Student not found";
  }

  public int getYearOfFoundation() {
    return yearOfFoundation;
  }
}
