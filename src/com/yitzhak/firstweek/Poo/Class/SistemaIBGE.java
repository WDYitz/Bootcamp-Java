package com.yitzhak.firstweek.Poo.Class;

import static java.lang.StringTemplate.STR;

import com.yitzhak.firstweek.Poo.Enum.EstadoBrasileiro;

@SuppressWarnings("unused")
public class SistemaIBGE {
  public static void main(String[] args) {
    for(EstadoBrasileiro estado : EstadoBrasileiro.values()){
      System.out.println(STR."Sigla: \{estado.getSigla()} - Nome: \{estado.getNome()} - Região: \{estado.getIbgeCode()}");
    }
  }
}
