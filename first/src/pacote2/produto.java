package pacote2;

import java.util.Locale;
import java.util.Scanner;

public class produto
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira os dados do produto:");
        System.out.printf("Nome: ");
        String name = sc.nextLine();
        System.out.printf("Preço: ");
        double price = sc.nextDouble();
        System.out.printf("Qtd. no estoque: ");
        int qtd = sc.nextInt();

        Product product = new Product(name, price, qtd);

        System.out.println("Product data: " + product);
        
        System.out.printf("Digite a qtd de produtos a serem adicionados no estoque: ");
        qtd = sc.nextInt();
        product.addProduct(qtd);

        System.out.println("Dados atualizados: " + product);

        System.out.printf("Digite a qtd de produtos a serem removidos no estoque: ");
        qtd = sc.nextInt();
        product.rmProduct(qtd);
        sc.nextLine();
        
        System.out.println("Dados atualizados: " + product);

        sc.close();
    }
}
