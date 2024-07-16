package com.yitzhak.secondweek.CollectionsAPI.List.Ordenacao;

import java.util.ArrayList;
import java.util.List;

public class PersonOrder {
  private List<Person> personList;

  public PersonOrder() {
    this.personList = new ArrayList<>();
  }

  public void addPerson(String name, int age, double height) {
    this.personList.add(new Person(name, age, height));
  }

  public List<Person> orderByAge() {
    List<Person> orderedList = new ArrayList<>(this.personList);
    orderedList.sort(Person::compareTo);
    return orderedList;
  }

  public List<Person> orderByHeight() {
    List<Person> orderedPerson = new ArrayList<>(this.personList);
    orderedPerson.sort(new ComparatorByHeight());
    return orderedPerson;
  } 

  public static void main(String[] args){
    PersonOrder personOrder = new PersonOrder();
    personOrder.addPerson("Bruna", 29, 1.64);
    personOrder.addPerson("Yitzhak", 23, 1.75);
    personOrder.addPerson("Gabriel", 26, 1.72);


    System.out.println(personOrder.orderByAge());
    System.out.println(personOrder.orderByHeight());
  }
}
