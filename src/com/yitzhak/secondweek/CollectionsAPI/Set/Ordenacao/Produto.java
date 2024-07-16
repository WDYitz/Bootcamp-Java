package com.yitzhak.secondweek.CollectionsAPI.Set.Ordenacao;

import java.util.Comparator;

public class Produto implements Comparable<Produto> {
  private String name;
  private int code;
  private double price;
  private int quantity;

  public Produto(String name, int code, double price, int quantity) {
    this.name = name;
    this.code = code;
    this.price = price;
    this.quantity = quantity;
  }

  public String getName() {
    return this.name;
  }

  public int getCode() {
    return this.code;
  }

  public double getPrice() {
    return this.price;
  }

  public int quantity() {
    return this.quantity;
  }

  @Override
  public String toString() {
    return "Produtos = { " + "nome: " + this.name + " , " + "code: " + this.code + " , " + "price: " + "R$ "
        + this.price + " , " + "Qtd: " + this.quantity;
  }

  @Override
  public int compareTo(Produto produto) {
    return this.name.compareToIgnoreCase(produto.getName());
  }
}

class ComparatorPorPreco implements Comparator<Produto> {
  @Override
  public int compare(Produto p1, Produto p2) {
    return Double.compare(p1.getPrice(), p2.getPrice());
  }
}
