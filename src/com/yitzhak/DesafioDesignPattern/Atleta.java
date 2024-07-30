package com.yitzhak.DesafioDesignPattern;

public class Atleta {
  private TipoExercicio TipoExercicio;

  public Atleta(TipoExercicio TipoExercicio) {
    this.TipoExercicio = TipoExercicio;
  }

  public void executarExercicio() {
    this.TipoExercicio.acao();
  }
}
