/*
Criar um programa que receba o valor de um produto 
e um código de aumento, segundo a tabela: 

Código	% aumento
1	10
3	25
4	30
8	 50

Utilizando a estrutura switch-case, mostrar em janela de saída o novo valor do produto depois de acrescida a porcentagem correspondente.
*/

import java.util.Scanner;

class Exemplo3 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o valor do produto: ");

    double valor = scanner.nextDouble();

    System.out.print("Digite o código do desconto: ");

    int codigo = scanner.nextInt();

    double total = 0;

    switch(codigo) {

      case 1:
        total = valor * 1.10;
        System.out.println("O valor do produto com aumento é " + total);
        break;
      case 3:
        total = valor * 1.25;
        System.out.println("O valor do produto com aumento é " + total);
        break;
      case 4:
        total = valor * 1.30;
        System.out.println("O valor do produto com aumento é " + total);
        break;
      case 8:
        total = valor * 1.50;
        System.out.println("O valor do produto com aumento é " + total);
        break; 
      default:
        System.out.println("Código de aumento inválido.");
        break;
    }


  }

}