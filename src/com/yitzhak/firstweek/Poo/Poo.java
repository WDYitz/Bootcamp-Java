package com.yitzhak.firstweek.Poo;

import static java.lang.StringTemplate.STR;

import com.yitzhak.firstweek.Poo.Class.School;
import com.yitzhak.firstweek.Poo.Class.Student;

@SuppressWarnings("unused")
public class Poo {
  public static void main(String[] args) {
    Student student1 = new Student("Yitzhak", 17, "Male");
    Student student2 = new Student("Lucas", 16, "Male");
    Student student3 = new Student("Camila", 16, "Female");

    Object[] students = { student1, student2, student3};

    // Dependency Injection (DI)
    School school = new School("Miami Coral Park", 2004, students);

    String studentName = school.getStudentName("Yitzhak");

    System.out.println(STR."\{studentName} is a student of \{school.getSchoolName()} that was founded in \{school.getYearOfFoundation()}, The school has a total of \{school.getStudents().length} students.");
    
  }
}
