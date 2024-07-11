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
    School school = new School("Miami Coral Park", 2004, new Object[] { student1, student2, student3  });

    String studentName = school.getStudentName("Yitzhak");

    System.out.println(STR."\{studentName} is a student of \{school.getSchoolName()} that was founded in \{school.getYearOfFoundation()}, The school has \{school.getStudents().length} students.");
    
  }
}
