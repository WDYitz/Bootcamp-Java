package com.yitzhak.secondweek.CollectionsAPI.List;

public class Book {
  private String titulo;
  private String author;
  private int anoPublicacao;

  public Book(String titulo, String author, int anoPublicacao) {
    this.titulo = titulo;
    this.author = author;
    this.anoPublicacao = anoPublicacao;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public String getAuthor() {
    return this.author;
  }

  public int getAnoPublicacao() {
    return this.anoPublicacao;
  }

  @Override
  public String toString() {
    return "Livro = {" +
        "titulo: " + titulo + "," +
        "author: " + author + "," +
        "anoPublicacao: " + anoPublicacao +
        '}';
  }
}
