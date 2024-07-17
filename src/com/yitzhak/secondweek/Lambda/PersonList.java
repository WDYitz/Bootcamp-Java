package com.yitzhak.secondweek.Lambda;

import java.util.ArrayList;
import java.util.List;

import com.yitzhak.secondweek.CollectionsAPI.List.Ordenacao.Person;

public class PersonList {
  private List<Person> personList;

  public PersonList() {
    this.personList = new ArrayList<>();
  }

  public List<Person> ordenarPorAltura() {
    List<Person> orderedList = new ArrayList<>(this.personList);
    if (this.personList.isEmpty()) {
      return null;
    }
    orderedList.sort((p1, p2) -> Double.compare(p1.getHeight(), p2.getHeight()));
    return orderedList;
  }
}
