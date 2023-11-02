package com.betrybe.sistemadevotacao;

/**
 * Classe para a pessoa.
 */
public abstract class Pessoa {

  /**
   * Atributos.
   */
  protected String nome;

  /**
   * Método get e set.
   */
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
