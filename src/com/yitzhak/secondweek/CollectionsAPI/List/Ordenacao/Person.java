package com.yitzhak.secondweek.CollectionsAPI.List.Ordenacao;

import java.util.Comparator;

public class Person implements Comparable<Person> {
  private String name;
  private int age;
  private double height;

  public Person(String name, int age, double height) {
    this.name = name;
    this.age = age;
    this.height = height;
  }

  @Override
  public int compareTo(Person person) {
    return Integer.compare(this.age, person.getAge());
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public double getHeight() {
    return height;
  }

  @Override
  public String toString() {
    return "Person = { " +
        "name: " + name + ", " +
        "age: " + age + ", " +
        "height: " + height +
        '}';
  }

}

class ComparatorByHeight implements Comparator<Person> {

  @Override
  public int compare(Person person1, Person person2) {
    return Double.compare(person1.getHeight(), person2.getHeight());
  }
}
