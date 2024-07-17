package com.yitzhak.secondweek.FunctionaInterfaces.Supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
  public static void main(String[] args) {
    Supplier<String> saudacao = () -> "Hello, World!";

    List<String> listaSaudacoes = Stream.generate(saudacao).limit(5).toList();
    List<String> listaSaudacoes2 = Stream.generate(() -> "Hello, World!").limit(5).toList();

    listaSaudacoes.forEach(saudacaoGerada -> System.out.println(saudacaoGerada));
    listaSaudacoes2.forEach(saudacaoGerada -> System.out.println(saudacaoGerada));
  }
}
