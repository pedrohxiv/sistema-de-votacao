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

  /**
   * Método para votar.
   */
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    for (String cpfComputado : cpfsComputados) {
      if (cpfComputado.equals(cpfPessoaEleitora)) {
        System.out.println("Pessoa eleitora já votou!");
        return;
      }
    }

    for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
      if (pessoaCandidata.getNumero() == numeroPessoaCandidata) {
        pessoaCandidata.receberVoto();
      }
    }

    cpfsComputados.add(cpfPessoaEleitora);
  }

  /**
   * Método para mostrar o resultado.
   */
  public void mostrarResultado() {
    if (cpfsComputados.isEmpty()) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
      return;
    }

    for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
      System.out.println("Nome: "
          + pessoaCandidata.getNome() + " - "
          + pessoaCandidata.getVotos() + " votos" + " ( "
          + pessoaCandidata.getVotos() * 100 / cpfsComputados.size() + "% )");
    }

    System.out.println("Total de votos: " + cpfsComputados.size());
  }
}
