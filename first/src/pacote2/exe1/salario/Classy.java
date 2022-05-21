package pacote2.exe1.salario;

import java.util.Scanner;

public class Classy
{
  Scanner sc = new Scanner(System.in);

  public String name;
  public double grossSalary;
  public double tax;

  public double NetSalary()
  {
    return grossSalary - tax;
  }

  public double aumentaSalario(double percent)
  {
    return grossSalary += grossSalary * percent / 100.0;
  }

  public String toString()
  {
    return name + ", $ " + String.format("%.2f", NetSalary());
  }

}