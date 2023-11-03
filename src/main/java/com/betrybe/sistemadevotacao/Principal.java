package com.betrybe.sistemadevotacao;

import java.util.Scanner;

/**
 * Classe principal.
 */
public class Principal {

  /**
   * Método main.
   *
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();

    cadastrarIndividuoEleitoral(input, gerenciamentoVotacao, "candidata");
    cadastrarIndividuoEleitoral(input, gerenciamentoVotacao, "eleitora");

    int opc;

    do {
      System.out.println("Entre com o número correspondente à opção desejada");
      System.out.println("1 - Votar");
      System.out.println("2 - Resultado Parcial");
      System.out.println("3 - Finalizar Votação");

      opc = Integer.parseInt(input.nextLine());

      if (opc == 1) {
        System.out.println("Entre com o CPF da pessoa eleitora:");
        String cpf = input.nextLine();

        System.out.println("Entre com o número da pessoa candidata:");
        int numero = Integer.parseInt(input.nextLine());

        gerenciamentoVotacao.votar(cpf, numero);
      } else if (opc == 2) {
        gerenciamentoVotacao.mostrarResultado();
      } else if (opc != 3) {
        System.out.println("Opção inválida");
      }
    } while (opc != 3);
    gerenciamentoVotacao.mostrarResultado();
  }

  private static void cadastrarIndividuoEleitoral(
      Scanner input,
      GerenciamentoVotacao gerenciamentoVotacao,
      String individuoEleitoral) {
    int opc;

    do {
      System.out.println("Cadastrar pessoa " + individuoEleitoral + "?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");

      opc = Integer.parseInt(input.nextLine());

      if (opc == 1) {
        System.out.println("Entre com o nome da pessoa " + individuoEleitoral + ":");
        String nome = input.nextLine();

        if (individuoEleitoral.equals("candidata")) {
          System.out.println("Entre com o número da pessoa candidata:");
          int numero = Integer.parseInt(input.nextLine());
          gerenciamentoVotacao.cadastrarPessoaCandidata(nome, numero);
        } else if (individuoEleitoral.equals("eleitora")) {
          System.out.println("Entre com o CPF da pessoa eleitora:");
          String cpf = input.nextLine();

          gerenciamentoVotacao.cadastrarPessoaEleitora(nome, cpf);
        }
      } else if (opc != 2) {
        System.out.println("Opção inválida.");
      }
    } while (opc != 2);
  }
}
