package com.yitzhak.secondweek.CollectionsAPI.Map.Ordenacao;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class AgendaEventos {
  public Map<LocalDate, Evento> eventosMap;

  public AgendaEventos() {
    eventosMap = new TreeMap<>();
  }

  public void adicionarEvento(String name, String event, LocalDate date) {
    this.eventosMap.put(date, new Evento(name, event));
  }

  public void listarEventos() {
    Map<LocalDate, Evento> eventosMap = new TreeMap<>(this.eventosMap);
    System.out.println("Eventos: " + eventosMap);
  }

  public void obterProximoEvento() {
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(this.eventosMap);
    LocalDate dataAtual = LocalDate.now();
    for (Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
      if (entry.getKey().isAfter(dataAtual) || entry.getKey().isEqual(dataAtual)) {
        System.out.println("Próximo evento: " + entry.getKey() + " - " + entry.getValue());
        break;
      }
    }
  }

  public static void main(String[] args) {
    AgendaEventos agendaEventos = new AgendaEventos();

    agendaEventos.adicionarEvento("Atração 1", "Evento 1", LocalDate.of(2022, 11, 22));
    agendaEventos.adicionarEvento("Atração 2", "Evento 2", LocalDate.of(2022, 11, 27));
    agendaEventos.adicionarEvento("Atração 2", "Evento 2", LocalDate.of(2022, 9, 27));

    agendaEventos.listarEventos();

    agendaEventos.obterProximoEvento();

   List<Character> consoantesMeuNome = Arrays.asList('c', 'm', 'l', 'c', 'v', 'l', 'c', 'n', 't');

    System.out.println("Consoantes: " + consoantesMeuNome);
  }
}
