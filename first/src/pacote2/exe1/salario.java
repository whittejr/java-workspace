package pacote2.exe1;

import java.util.Locale;
import java.util.Scanner;

public class salario
{
  public static void main(String[] args)
  {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Classy salary = new Classy();

    System.out.printf("Nome do funcionario: ");
    salary.name = sc.nextLine();
    System.out.printf("Salario bruto: ");
    salary.grossSalary = sc.nextDouble();
    System.out.printf("Taxa: ");
    salary.tax = sc.nextDouble();

    System.out.println("Funcionario: " + salary.toString());

    System.out.printf("Digite a porcentagem de aumento: ");
    double percent = sc.nextDouble();
    salary.aumentaSalario(percent);
    System.out.println();
    System.out.println("Dados atualizados: " + salary);

    sc.close();
  }

}