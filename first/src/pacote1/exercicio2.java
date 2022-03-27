package pacote1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos;
        double conta = 50.0;

        System.out.printf("Digite os minutos consumidos: ");
        minutos = sc.nextInt();
        
        if (minutos <= 100)
        {
            System.out.printf("O valor ficou em: R$ %.2f", conta);
        }
        else
        {
            conta += (minutos - 100) * 2.0;
            System.out.printf("O valor foi de: R$ %.2f", conta);
        }
        sc.close();
    }
}
