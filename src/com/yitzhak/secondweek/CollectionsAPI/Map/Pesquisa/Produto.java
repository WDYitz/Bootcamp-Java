package com.yitzhak.secondweek.CollectionsAPI.Map.Pesquisa;

public class Produto {
  private String name;
  private Double price;
  private int quantity;

  public Produto(String name, Double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public Double getPrice() {
    return this.price;
  }

  public int getQuantity() {
    return this.quantity;
  }

  @Override
  public String toString() {
    return "Produto [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
  }
}