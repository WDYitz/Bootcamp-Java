package com.yitzhak.secondweek.FunctionaInterfaces.Consumer;

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
    numeros.forEach(numero -> {
      if (numero % 2 != 0) {
        System.out.println("Numero impar: " + numero);
      }
    });
  }
}
