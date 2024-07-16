package com.yitzhak.secondweek.CollectionsAPI.Set.Pesquisa;

import java.util.Objects;

public class Contato {
  private String name;
  private int numero;

  public Contato(String name, int numero) {
    this.name = name;
    this.numero = numero;
  }

  public String getName() {
    return this.name;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  @Override
  public String toString() {
    return "Contato = { " + "nome: " + this.name + " , " + "numero: " + this.numero + " }";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Contato contato))
      return false;
    return Objects.equals(this.getName(), contato.getName());
  }
}
