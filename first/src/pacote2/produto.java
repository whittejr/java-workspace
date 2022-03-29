package pacote2;

import java.util.Locale;
import java.util.Scanner;

public class produto
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        

        Product product = new Product();

        System.out.println("Insira os dados do produto:");
        System.out.printf("Nome: ");
        product.name = sc.nextLine();

        System.out.printf("Preço: ");
        product.price = sc.nextDouble();

        System.out.printf("Qtd. no estoque: ");
        product.qtd = sc.nextInt();

        System.out.println("Product data: " + product);
        
        System.out.printf("Digite a qtd de produtos a serem adicionados no estoque: ");
        int quantity = sc.nextInt();
        product.addProduct(quantity);

        System.out.println("Dados atualizados: " + product);

        System.out.printf("Digite a qtd de produtos a serem removidos no estoque: ");
        quantity = sc.nextInt();
        product.rmProduct(quantity);
        sc.nextLine();
        
        System.out.println("Dados atualizados: " + product);

        sc.close();
    }
}
