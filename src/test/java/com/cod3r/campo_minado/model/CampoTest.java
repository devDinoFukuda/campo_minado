package com.cod3r.campo_minado.model;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CampoTest {

  private Campo campo;

  //*BeforeEach usa a instanciação a cada Iteração
  @BeforeEach
  void iniciarCampo() {
    campo = new Campo(3, 3);
  }

  @Test
  void testeVizinhoEsquerda() {
    Campo vizinho = new Campo(3, 2);
    Boolean resultado = campo.adicionarVizinho(vizinho);

    assertTrue(resultado);
  }

  @Test
  void testeVizinhoDireita() {
    Campo vizinho = new Campo(3, 4);
    Boolean resultado = campo.adicionarVizinho(vizinho);

    assertTrue(resultado);
  }
  
  @Test
  void testeVizinhoACima() {
    Campo vizinho = new Campo(2, 3);
    Boolean resultado = campo.adicionarVizinho(vizinho);

    assertTrue(resultado);
  }


  @Test
  void testeVizinhoABaixo() {
    Campo vizinho = new Campo(4, 3);
    Boolean resultado = campo.adicionarVizinho(vizinho);

    assertTrue(resultado);
  }


  @Test
  void testeVizinhoDiagonal() {
    Campo vizinho = new Campo(2, 2);
    Boolean resultado = campo.adicionarVizinho(vizinho);

    assertTrue(resultado);
  }

  @Test
  void testeNaoVizinho() {
    Campo vizinho = new Campo(1, 1);
    Boolean resultado = campo.adicionarVizinho(vizinho);

    assertFalse(resultado);
  }










}
