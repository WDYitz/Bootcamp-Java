package com.yitzhak.secondweek.CollectionsAPI.Map.Ordenacao;

public class Evento {
  private String name;
  private String event;

  public Evento(String name, String event) {
    this.name = name;
    this.event = event;
  }

  public String getName() {
    return this.name;
  }

  public String getEvent() {
    return this.event;
  }

  @Override
  public String toString() {
    return "Evento{" +
        "name='" + name + '\'' +
        ", event='" + event + '\'' +
        '}';
  }

}
