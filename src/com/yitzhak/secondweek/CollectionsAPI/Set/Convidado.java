package com.yitzhak.secondweek.CollectionsAPI.Set;

import java.util.Objects;

public class Convidado {
  private String name;
  private int codigoConvite;

  public Convidado(String name, int codigoConvite) {
    this.name = name;
    this.codigoConvite = codigoConvite;
  }

  public String getName() {
    return this.name;
  }

  public int getCodigoConvite() {
    return this.codigoConvite;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Convidado convidado))
      return false;
    return getCodigoConvite() == convidado.getCodigoConvite();
  }

  @Override
  public int hashCode() {
    return Objects.hash(getCodigoConvite());
  }

  @Override
  public String toString() {
    return "Convidados = { " + "nome: " + this.name + " , " + "codigoConvite: " + this.codigoConvite + " }";
  }
}
