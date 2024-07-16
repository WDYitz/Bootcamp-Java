package com.yitzhak.secondweek.CollectionsAPI.Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
  private Set<Contato> contatosSet;

  public AgendaContatos() {
    this.contatosSet = new HashSet<>();
  }

  public void adicionarContato(String name, int numero) {
    this.contatosSet.add(new Contato(name, numero));
  }

  public void exibirContato() {
    System.out.println(contatosSet);
  }

  public Set<Contato> pesquisarPorNome(String nome) {
    Set<Contato> contatoPorNome = new HashSet<>();

    for (Contato contato : contatosSet) {
      if (contato.getName().startsWith(nome)) {
        contatoPorNome.add(contato);
      }
    }

    return contatoPorNome;
  }

  public Contato atualizarNumeroContato(String nome, int novoNumero) {
    Contato contatoAtualizado = null;

    for (Contato contato : contatosSet) {
      if (contato.getName().equalsIgnoreCase(nome)) {
        contato.setNumero(novoNumero);
        contatoAtualizado = contato;
        break;
      }
    }

    return contatoAtualizado;
  }

  public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.exibirContato();

    agendaContatos.adicionarContato("Rodrigo", 994376454);
    agendaContatos.adicionarContato("Rodrigo Ferreira", 984375254);
    agendaContatos.adicionarContato("Carlos", 984378554);
    agendaContatos.adicionarContato("Julio", 984323254);


    agendaContatos.exibirContato();

    System.out.println(agendaContatos.pesquisarPorNome("Rodrigo"));
  }

}
