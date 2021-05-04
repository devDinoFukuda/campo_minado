package com.cod3r.campo_minado.model;

import java.util.ArrayList;
import java.util.List;

public class Campo {

  private final Integer linha;
  private final Integer coluna;
  
  private Boolean aberto = false;
  private Boolean minado = false;
  private Boolean marcado = false;

  private List<Campo> vizinhos = new ArrayList<>();


  public Campo(Integer linha, Integer coluna) {
    this.linha = linha;
    this.coluna = coluna;
  }



  Boolean adicionarVizinho(Campo vizinho) {
    Boolean linhaDiferente = linha != vizinho.linha;
    Boolean colunaDiferente = coluna != vizinho.coluna;
    Boolean diagonal = linhaDiferente && colunaDiferente;

    Integer deltaLinha = Math.abs(linha - vizinho.linha);
    Integer deltaColuna = Math.abs(coluna - vizinho.coluna);
    Integer deltaGeral = deltaColuna + deltaLinha;

    if(deltaGeral == 1 && !diagonal) {
      vizinhos.add(vizinho);
      return true;
    } else if(deltaGeral == 2 && diagonal) {
      vizinhos.add(vizinho);
      return true;
    } else {
      return false;
    }
  }


  
  


}
