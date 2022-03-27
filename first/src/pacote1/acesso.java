package pacote1;

import java.util.Scanner;

public class acesso 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int senha = 2002;

        System.out.printf("Digite a senha: ");
        int x = sc.nextInt();
    
        while (x != senha)
        {
            System.out.println("Acesso Negado!");
            System.out.printf("Digite a senha novamente: ");
            x = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Acesso Permitido!");
        sc.close();
    }    
}
