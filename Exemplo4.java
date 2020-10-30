
/*
Implementar programa que peça ao usuário dois valores e uma operação matemática entre (+), (-), (/) e (*). O programa deverá executar a operação matemática digitada pelo usuário com os valores fornecidos e mostrar o resultado.
*/

import java.util.Scanner;

class Exemplo4 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");

    double numero1 = scanner.nextDouble();

    System.out.print("Digite o segundo número: ");

    double numero2 = scanner.nextDouble();

    System.out.print("Digite a operação (+,-,* ou /): ");

    String operacao = scanner.next();

    double resultado;
    
    switch(operacao) {

      case "+":
        resultado = numero1 + numero2;
        System.out.println("O resultado é " + resultado);
        break;
      case "-":
        resultado = numero1 - numero2;
        System.out.println("O resultado é " + resultado);
        break;
      case "*":
        resultado = numero1 * numero2;
        System.out.println("O resultado é " + resultado);
        break;
      case "/":
        resultado = numero1 / numero2;
        System.out.println("O resultado é " + resultado);
        break; 
      default:
        System.out.println("Operação inválida.");
        break;
    }


  }

}