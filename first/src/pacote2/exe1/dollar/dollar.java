package pacote2.exe1.dollar;

import java.util.Locale;
import java.util.Scanner;

public class dollar
{
  public static void main(String[] args)
  {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    conversor conv = new conversor();

    System.out.println("Qual a cotação do dolar? ");
    conv.cota = sc.nextDouble();

    System.out.println("Quantos dolares serao comprados? ");
    conv.qtd = sc.nextDouble();

    System.out.printf("Quantidade a ser paga em reais: %.2f", conv.taxa());

    sc.close();
  }
}
