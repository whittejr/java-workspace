package pacote1;

import java.util.Scanner;

public class exercicio1
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    int x, y, z;

    System.out.printf("Digite o primeiro numero: ");
    x = sc.nextInt();
    sc.nextLine();
    System.out.printf("Digite o segundo numero: ");
    y = sc.nextInt();
    sc.nextLine();

    z = x + y;

    System.out.println("SOMA: " + z);

    sc.close();
  }
}
