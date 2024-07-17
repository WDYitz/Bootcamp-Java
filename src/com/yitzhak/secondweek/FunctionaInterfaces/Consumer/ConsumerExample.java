package com.yitzhak.secondweek.FunctionaInterfaces.Consumer;

/*
 * Consumer é uma interface funcional que representa uma função que recebe um argumento e não retorna nenhum valor.
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    Consumer<Integer> imprimirNumeroPar = numero -> {
      if (numero % 2 == 0) {
        System.out.println("Numero par: " + numero);
      }
    };

    numeros.forEach(imprimirNumeroPar);
    // Outra forma de realizar a mesma operação
    numeros.stream().filter(numero -> numero % 2 != 0).forEach(numero -> System.out.println("Numero impar: " + numero));
  }
}
