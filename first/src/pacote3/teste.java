package pacote3;

import java.util.Locale;
import java.util.Scanner;

public class teste
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    int a = sc.nextInt();
    double b = sc.nextDouble();
    String s1 = sc.nextLine();
    
    System.out.println("String: " + s1);
    System.out.println("Double: " + b);
    System.out.println("Int: " + a);

    sc.close();
  }
}
