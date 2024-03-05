package org.programa;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
  List<Pecas> pecas = new ArrayList<>();
  Estoque estoque = new Estoque();
  Pecas p = new Pecas();

  public void adicionar(Pecas p) { pecas.add(p); }

  public void listaPecas() {
    pecas.forEach((p) -> {
      System.out.println("Id: " + p.getId());
      System.out.println("Desc: " + p.getDesc());
      System.out.println("-----------------------------");
    });
  }

  public void remover(int id) {
    for (int i = 0; i < pecas.size(); i++) {
      if (pecas.get(i).getId().equals(id)) {
        pecas.remove(i);
      }
    }
  }
}
