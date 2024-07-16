package com.yitzhak.secondweek.CollectionsAPI.List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class BookCatalogue {
  private List<Book> books;

  public BookCatalogue() {
    this.books = new ArrayList<>();
  }

  public void addBook(String titulo, String author, int anoPublicacao) {
    this.books.add(new Book(titulo, author, anoPublicacao));
  }

  public List<Book> searchByAuthor(String author) {
    List<Book> booksByAuthor = new ArrayList<>();
    if (this.books.isEmpty()) {
      return null;
    }
    for (Book book : this.books) {
      if (book.getAuthor().equalsIgnoreCase(author)) {
        booksByAuthor.add(book);
      }
    }
    return booksByAuthor;
  }

  public List<Book> searchByYearInterval(int yearStart, int yearEnd) {
    List<Book> booksByYearInterval = new ArrayList<>();
    if (this.books.isEmpty()) {
      return null;
    }
    for (Book book : this.books) {
      if (book.getAnoPublicacao() >= yearStart && book.getAnoPublicacao() <= yearEnd) {
        booksByYearInterval.add(book);
      }
    }
    return booksByYearInterval;
  }

  public Book searchByTitle(String title) {
    Book booksByTitle = null;
    if (this.books.isEmpty()) {
      return null;
    }
    for (Book book : this.books) {
      if (book.getTitulo().equalsIgnoreCase(title)) {
        booksByTitle = book;
      }
    }
    return booksByTitle;
  }

  public static void main(String[] args) {
    BookCatalogue bookCatalogue = new BookCatalogue();
    bookCatalogue.addBook("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
    bookCatalogue.addBook("O Hobbit", "J.R.R. Tolkien", 1937);
    bookCatalogue.addBook("O Silmarillion", "J.R.R. Tolkien", 1977);
    bookCatalogue.addBook("O Código Da Vinci", "Dan Brown", 2003);
    bookCatalogue.addBook("Anjos e Demônios", "Dan Brown", 2000);
    bookCatalogue.addBook("O Símbolo Perdido", "Dan Brown", 2009);
    bookCatalogue.addBook("Inferno", "Dan Brown", 2013);
    bookCatalogue.addBook("Origem", "Dan Brown", 2017);
    bookCatalogue.addBook("Fortaleza Digital", "Dan Brown", 1998);
    bookCatalogue.addBook("Ponto de Impacto", "Dan Brown", 2001);
    bookCatalogue.addBook("O Código Digital", "Dan Brown", 2004);

    System.out.println(bookCatalogue.searchByAuthor("Dan Brown"));
    System.out.println(bookCatalogue.searchByYearInterval(2000, 2010));
    System.out.println(bookCatalogue.searchByTitle("O Código Da Vinci"));
  }
}
