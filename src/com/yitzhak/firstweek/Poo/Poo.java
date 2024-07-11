package com.yitzhak.firstweek.Poo;

import static java.lang.StringTemplate.STR;

import com.yitzhak.firstweek.Poo.Class.School;
import com.yitzhak.firstweek.Poo.Class.Student;

@SuppressWarnings("unused")
public class Poo {
  public static void main(String[] args) {
    Student student = new Student("Yitzhak", 22, "Male");
    School school = new School("Miami Coral Park", 2004, new Object[] { student });

    String studentName = school.getStudentName("Yitzhak");

    System.out.println(STR."\{studentName} is a student of \{school.getSchoolName()} that was founded in \{school.getYearOfFoundation()}.");
  }
}
