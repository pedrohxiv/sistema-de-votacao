package com.betrybe.sistemadevotacao;

/**
 * Classe para a pessoa eleitora.
 */
public class PessoaEleitora extends Pessoa {

  /**
   * Atributos.
   */
  private String cpf;

  /**
   * Constructor.
   *
   * @param nome String para o nome da pessoa eleitora.
   * @param cpf  String para o cpf da pessoa eleitora.
   */
  public PessoaEleitora(String nome, String cpf) {
    super.nome = nome;
    this.cpf = cpf;
  }

  /**
   * Método get e set.
   */
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
