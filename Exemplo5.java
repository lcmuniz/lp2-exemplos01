/*
Crie um programa em Java que solicita duas notas de um aluno, calcule a média das notas e imprima na tela se o aluno foi aprovado ou não de acordo com o seguinte critério: se a média das notas for maior ou igual a 7, o aluno foi aprovado. Caso contrário, foi reprovado. O programa deve também informar se o aluno ficou de recuperação. O aluno fica de recuperação se a nota for menor que 7 mas maior que 4.
*/

import java.util.Scanner;

class Exemplo5 {

  public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite a primeira nota: ");
      double nota1 = scanner.nextDouble();

      System.out.print("Digite a segunda nota: ");
      double nota2 = scanner.nextDouble();

      double media = (nota1 + nota2) / 2;

      if (media >= 7) {
        System.out.println("Você foi aprovado com média " + media);
      } 
      else if (media >= 4) {
        System.out.println("Você ficou de recuperação com média " + media);
      }
      else {
        System.out.println("Você foi reprovado com média " + media);
      }

  }

}