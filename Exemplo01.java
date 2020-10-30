/*
Faça um programa que calcule a média de salários de uma empresa, pedindo ao usuário a lista de funcionários (nomes) e os salários. O programa deverá apresentar o nome e salário de cada funcionário e a média dos salários.
*/

import java.util.Scanner;

class Exemplo01 {

  public static void main(String[] args) {

    String[] nomes = new String[100];
    double[] salarios = new double[100];

    int totalFuncionarios = 0;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Entre com os funcionários e seus salários.");
    System.out.println("Para terminar, digite FIM para o próximo nome.");
    System.out.println();

    while (true) {

      System.out.print("Nome: ");
      String nomeFuncionario = scanner.next();

      if (nomeFuncionario.equals("FIM")) {
        break;
      }

      System.out.print("Salário: ");
      double salarioFuncionario = scanner.nextDouble();

      nomes[totalFuncionarios] = nomeFuncionario;
      salarios[totalFuncionarios] = salarioFuncionario;

      totalFuncionarios++;

  
      System.out.println();

    }

    System.out.println();

    double soma = 0;
    for (int i = 0; i < totalFuncionarios; i++) {

        soma = soma + salarios[i];
        System.out.println(nomes[i] + " - " + salarios[i]);

    }

    double media = soma / totalFuncionarios;

    System.out.println("A média dos salários é " + media);



  }

}