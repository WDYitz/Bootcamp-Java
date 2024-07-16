package com.yitzhak.secondweek.CollectionsAPI.Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
  Set<Produto> produtosSet;

  public CadastroProdutos() {
    this.produtosSet = new HashSet<>();
  }

  public void adicionarProduto(String name, int code, double price, int quantity) {
    produtosSet.add(new Produto(name, code, price, quantity));
  }

  public Set<Produto> exibirProdutosPorNome() {
    Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);
    return produtosPorNome;
  }

  public Set<Produto> exibirProdutosPorPreco() {
    Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
    produtosPorPreco.addAll(produtosSet);
    return produtosPorPreco;
  }

  public static void main(String[] args) {
    CadastroProdutos cadastroProdutos = new CadastroProdutos();

    cadastroProdutos.adicionarProduto("Arroz", 12, 177.00D, 20);
    cadastroProdutos.adicionarProduto("Feijao", 12, 19.00D, 1);

    System.out.println(cadastroProdutos.produtosSet);
    System.out.println(cadastroProdutos.exibirProdutosPorNome());
    System.out.println(cadastroProdutos.exibirProdutosPorPreco());
  }
}
