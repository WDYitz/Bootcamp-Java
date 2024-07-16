package com.yitzhak.secondweek.CollectionsAPI.Set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
  private Set<Convidado> convidadosSet;

  public ConjuntoConvidados() {
    this.convidadosSet = new HashSet<>();
  }

  public void adicionarConvidado(String nome, int codigoConvite) {
    this.convidadosSet.add(new Convidado(nome, codigoConvite));
  }

  public void removerConvidado(int codigoConvite) {
    Convidado convidadoRemovido = null;
    for (Convidado convidado : convidadosSet) {
      if (convidado.getCodigoConvite() == codigoConvite) {
        convidadoRemovido = convidado;
      }
    }
    this.convidadosSet.remove(convidadoRemovido);
  }

  public int contarConvidados() {
    return this.convidadosSet.size();
  }

  public void exibirConvidados() {
    System.out.println(this.convidadosSet);
  }

  public static void main(String[] args) {
    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
    System.out
        .println("Existem " + conjuntoConvidados.contarConvidados() + " convidados(a) dentro do Set de Convidados");

    conjuntoConvidados.adicionarConvidado("Convidado 1", 1200);
    conjuntoConvidados.adicionarConvidado("Convidado 2", 1201);
    conjuntoConvidados.adicionarConvidado("Convidado 3", 1202);
    conjuntoConvidados.adicionarConvidado("Convidado 4", 1202);

    System.out
        .println("Existem " + conjuntoConvidados.contarConvidados() + " convidados(a) dentro do Set de Convidados");

    conjuntoConvidados.removerConvidado(1200);
    conjuntoConvidados.exibirConvidados();
   
  }
}
