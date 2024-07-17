package com.yitzhak.secondweek.CollectionsAPI.Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
  private Map<String, Integer> contatosMap;

  public AgendaContatos() {
    this.contatosMap = new HashMap<>();
  }

  public void adicionarContato(String name, int number) {
    this.contatosMap.put(name, number);
  }

  public void removerContato(String name) {
    if (!this.contatosMap.isEmpty()) {
      this.contatosMap.remove(name);
    }
  }

  public void exibirContatos() {
    if (this.contatosMap.isEmpty()) {
      System.out.println("Agenda vazia.");
      return;
    }
    System.out.println(contatosMap);
  }

  public Integer pesquisarPorNome(String name) {
    if (this.contatosMap.isEmpty()) {
      return null;
    }
    return this.contatosMap.get(name);
  }

  public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.adicionarContato("Yitzhak", 123456789);
    agendaContatos.adicionarContato("Lucas", 987654321);

    agendaContatos.exibirContatos();

    System.out.println(agendaContatos.pesquisarPorNome("Yitzhak"));
    System.out.println(agendaContatos.pesquisarPorNome("Lucas"));

    agendaContatos.removerContato("Lucas");

    agendaContatos.exibirContatos();
  }
}
