package com.yitzhak.DesafioDesignPattern;

public class Main {
  public static void main(String[] args) {
    TipoExercicio agachar = new Agachar();
    TipoExercicio pular = new Pular();
    TipoExercicio correr = new Correr();

    Atleta atleta = new Atleta(correr);
    atleta.executarExercicio();

    atleta = new Atleta(agachar);
    atleta.executarExercicio();

    atleta = new Atleta(pular);
    atleta.executarExercicio();
  }
}
