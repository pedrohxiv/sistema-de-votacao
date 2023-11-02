package com.betrybe.sistemadevotacao;

/**
 * Classe para a pessoa candidata.
 */
public class PessoaCandidata extends Pessoa {

  /**
   * Atributos.
   */
  private int numero;
  private int votos;

  /**
   * Constructor.
   *
   * @param nome   String para o nome da pessoa candidata.
   * @param numero int para o número da pessoa candidata.
   */
  public PessoaCandidata(String nome, int numero) {
    super.nome = nome;
    this.numero = numero;
    this.votos = 0;
  }

  /**
   * Métodos getters.
   */
  public int getNumero() {
    return numero;
  }

  public int getVotos() {
    return votos;
  }

  /**
   * Método set.
   */
  public void setNumero(int numero) {
    this.numero = numero;
  }

  /**
   * Método para receber um voto.
   */
  public void receberVoto() {
    this.votos += 1;
  }
}
