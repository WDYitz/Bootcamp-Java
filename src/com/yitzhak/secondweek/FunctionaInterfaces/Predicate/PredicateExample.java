package com.yitzhak.secondweek.FunctionaInterfaces.Predicate;

/*
 * Predicate é uma interface funcional que representa uma função que recebe um argumento e retorna um valor booleano.
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
  public static void main(String[] args) {
    List<String> tecnologias = Arrays.asList("Java", "Python", "JavaScript", "Ruby", "C#");

    Predicate<String> tecnologiaMaisDeCincoCaracteres = tecnologia -> tecnologia.length() > 5;

    tecnologias.stream().filter(tecnologiaMaisDeCincoCaracteres).forEach(tecnologia -> System.out.println(tecnologia));
  }
}
