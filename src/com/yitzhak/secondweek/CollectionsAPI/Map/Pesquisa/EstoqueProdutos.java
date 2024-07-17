package com.yitzhak.secondweek.CollectionsAPI.Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
  private Map<Long, Produto> produtosMap;

  public EstoqueProdutos() {
    this.produtosMap = new HashMap<>();
  }

  public void adicionarProduto(Long code, String name, Double price, int quantity) {
    this.produtosMap.put(code, new Produto(name, price, quantity));
  }

  public void exibirContato() {
    System.out.println(produtosMap);
  }

  public Double calcularValorTotalEstoque() {
    Double total = 0.0;
    if (!this.produtosMap.isEmpty()) {
      for (Produto produto : produtosMap.values()) {
        total += produto.getPrice() * produto.getQuantity();
      }
    }
    return total;
  }

  public Produto exibirProdutoMaisCaro() {
    Produto produtoMaisCaro = null;
    double maiorPreco = Double.MIN_VALUE;

    for (Produto produto : produtosMap.values()) {
      if (produto.getPrice() > maiorPreco) {
        maiorPreco = produto.getPrice();
        produtoMaisCaro = produto;
      }
    }
    return produtoMaisCaro;
  }

  public static void main(String[] args) {
    EstoqueProdutos estoque = new EstoqueProdutos();
    estoque.adicionarProduto(1L, "Produto 1", 10.0, 5);
    estoque.adicionarProduto(2L, "Produto 2", 20.0, 10);
    estoque.adicionarProduto(3L, "Produto 3", 30.0, 15);
    estoque.adicionarProduto(4L, "Produto 4", 40.0, 20);
    estoque.adicionarProduto(5L, "Produto 5", 50.0, 25);

    estoque.exibirContato();
    System.out.println("Valor total do estoque: " + estoque.calcularValorTotalEstoque());
    System.out.println("Produto mais caro: " + estoque.exibirProdutoMaisCaro());
  }

}
