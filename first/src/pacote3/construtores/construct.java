package pacote3.construtores;

import java.util.Locale;
import java.util.Scanner;

public class construct
{
  public static void main(String[] args)
  {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter product data");
    System.out.printf("Name: ");
    String name = sc.nextLine();
    System.out.printf("Price: ");
    double price = sc.nextDouble();
    System.out.printf("Quantity in stock: ");
    int quantity = sc.nextInt();  
    Product product = new Product(name, price, quantity);

    System.out.println(); 
    System.out.println("Product data: " + product);

    System.out.print("Enter the number of products to be added in stock: ");
    quantity = sc.nextInt();
    product.addProducts(quantity);
    System.out.println("Updated data: " + product);
    System.out.print("Enter the number of products to be removed from stock: ");
    quantity = sc.nextInt();
    product.removeProducts(quantity);
    System.out.println("Updated data: " + product);
    
    sc.close();
  }
}