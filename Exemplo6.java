/*
Criar um programa para cálculo do salário líquido em que três valores devem ser informados pelo usuário: a quantidade de horas trabalhadas, o salário hora e o número de dependentes. O programa deve mostrar como saída as seguintes informações:
Salário bruto: Horas trabalhadas * salário hora + (50 * número de dependentes)
Desconto INSS:
Se salário bruto <= 1000 INSS=salário bruto * 8.5/100 
Se salário bruto > 1000 INSS=salário bruto * 9/100 
Desconto IR:
Se salário bruto <= 500 IR=0 
Se salário bruto > 500 e <= 1000 IR=salário bruto*5/100 
Se salário bruto > 1000 IR=salário bruto*7/100 


*/

import java.util.Scanner;

class Exemplo6 {

  public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      System.out.print("Horas trabalhadas: ");
      int horasTrabalhadas = scanner.nextInt();

      System.out.print("Valor da hora: ");
      double valorHora = scanner.nextDouble();

      System.out.print("Número de dependentes: ");
      int numeroDependentes = scanner.nextInt();

      double salarioBruto = horasTrabalhadas * valorHora + (50 * numeroDependentes);

      double inss = 0;

      if (salarioBruto <= 1000) {
        inss = salarioBruto * (8.5/100);
      }
      else {
        inss = salarioBruto * (9.0/100);
      }

      double ir = 0;

      if (salarioBruto <= 500) {
        ir  = 0;
      }
      else if (salarioBruto > 500 && salarioBruto <= 1000) {
        ir = salarioBruto * (5.0/100);
      }
      else {
        ir = salarioBruto * (7.0/100);
      }

      System.out.println("Salário bruto: " + salarioBruto);
      System.out.println("Desconto INSS: " + inss);
      System.out.println("Desconto IR: " + ir);
      System.out.println("Salário líquido: " + (salarioBruto - inss -ir));


  }

}