package com.yitzhak.firstweek.Poo.Enum;

public enum EstadoBrasileiro {
  SAO_PAULO("SP", "São Paulo", 35),
  RIO_DE_JANEIRO("RJ", "Rio de Janeiro", 33),
  MINAS_GERAIS("MG", "Minas Gerais", 31),
  BAHIA("BA", "Bahia", 29);

  private String sigla;
  private String nome;
  private int ibge;

  private EstadoBrasileiro(String sigla, String nome, int ibge) {
    this.sigla = sigla;
    this.nome = nome;
    this.ibge = ibge;
  }

  public String getSigla() {
    return sigla;
  }

  public String getNome() {
    return nome;
  }

  public int getIbgeCode() {
    return ibge;
  }
}
