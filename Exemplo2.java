/*
Desenvolver programa que peca ao usuário para cadastrar uma senha; na sequencia, deve pedir ao usuário que digite dois valores reais, e ira calcular a divisão da primeira pela segunda. O programa ira pedir ao usuário que digite sua senha: Se estiver correta ela mostra o resultado da divisão. Senão da mensagem de erro e encerra o aplicativo.
*/

import java.util.Scanner;

class Exemplo2 {
  
  public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite uma senha: ");
      
      String senha = scanner.next();

      System.out.print("Digite um número: ");

      double numero1 = scanner.nextDouble();

      System.out.print("Digite outro número: ");

      double numero2 = scanner.nextDouble();

      System.out.print("Entre com sua senha novamente: ");

      String confirmacao = scanner.next();

      if (senha.equals(confirmacao)) {
        double divisao = numero1 / numero2;
        System.out.println("O resultado é " + divisao);
      }
      else {
        System.out.println("Senha inválida.");
      }



  }
}