/*
Crie um programa em Java que solicite números inteiros positivos pelo teclado. O programa deve ficar pedindo números ao usuário até que este digite o número zero. Se o usuário digitar um número menor que zero, o programa deve informar que o número é inválido e continuar solicitando os números. Quando o usuário digitar zero, o programa deve informar na tela a soma dos números, a média dos números e o maior e o menor número entrado pelo usuário.
*/

import java.util.Scanner;

class Exemplo7 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite números inteiros positivos.");
    System.out.println("Digite 0 para sair.");
    System.out.println();

    int soma = 0;
    int quantidade = 0;

    int maior = 0;
    int menor = 100000000;

    while (true) {

      System.out.print(">>> ");
      int numero = scanner.nextInt();

      if (numero < 0) {
        System.out.println("Número inválido.");
        continue;
      }
      else if (numero == 0) {
        break;
      }


      soma = soma + numero;

      quantidade++;

      if (numero > maior) {
        maior = numero;
      }

      if (numero < menor) {
        menor = numero;
      }

    }

    double media = (1.0 * soma) / quantidade;

    System.out.println("Soma: " + soma);
    System.out.println("Média: " + media);
    System.out.println("Menor: " + menor);
    System.out.println("Maior: " + maior);

  }

}