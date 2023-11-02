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

  /**
   * Método para cadastrar uma pessoa candidata.
   */
  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
      if (pessoaCandidata.getNumero() == numero) {
        System.out.println("Número da pessoa candidata já utilizado!");
        return;
      }
    }

    pessoasCandidatas.add(new PessoaCandidata(nome, numero));
  }

  /**
   * Método para cadastrar uma pessoa eleitora.
   */
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (PessoaEleitora pessoaEleitora : pessoasEleitoras) {
      if (pessoaEleitora.getCpf().equals(cpf)) {
        System.out.println("Pessoa eleitora já cadastrada!");
        return;
      }
    }

    pessoasEleitoras.add(new PessoaEleitora(nome, cpf));
  }

  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {

  }

  public void mostrarResultado() {

  }
}
