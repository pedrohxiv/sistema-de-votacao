package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

/**
 * Classe para o gerenciamento de votação.
 */
public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {

  /**
   * Atributos.
   */
  private ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<>();
  private ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<>();
  private ArrayList<String> cpfsComputados = new ArrayList<>();

  public void cadastrarPessoaCandidata(String nome, int numero) {

  }

  public void cadastrarPessoaEleitora(String nome, String cpf) {

  }

  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {

  }

  public void mostrarResultado() {

  }
}
