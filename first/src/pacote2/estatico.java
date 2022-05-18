package pacote2;

import java.util.Locale;
import java.util.Scanner;

public class estatico
{
  public static final double PI = 3.14159;

  public static void main(String[] args)
  {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Statical stat = new Statical();

    System.out.printf("Enter radius: ");
    double radius = sc.nextDouble();

    double c = stat.circumference(radius);

    double v = stat.volume(radius);

    System.out.printf("Circumference: %.2f: ", c);
    System.out.printf("\nVolume: %.2f: ", v);
    System.out.printf("\nPI value: %.2f: ", stat.PI);

    sc.close();
  }
}
