package com.yitzhak.secondweek.FunctionaInterfaces.Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
  public static void main(String[] args) {
    List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5);

    Function<Integer, Integer> converterNumeroParaString = numero -> numero * 2;
    List<Integer> numerosDobrados = listaNumeros.stream().map(n -> n * 2).toList();

    numerosDobrados.forEach(numero -> System.out.println(numero));
    numerosDobrados.forEach(numero -> System.out.println(converterNumeroParaString.apply(numero)));
  }
}
