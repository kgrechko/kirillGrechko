package main.java.com.hillel.hw14;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> ProductList = new ArrayList<String>();
        boolean Full = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter products and quantity:");

        do
        {
            System.out.println("Enter product name (or stop to end adding products): ");
            String Product = scanner.nextLine();

                if (Product.equals("stop"))
                {
                    Full = false;
                }

                else
                {
                    System.out.println("quantity: ");
                    int quantity = Integer.parseInt(scanner.nextLine());
                    addProduct(ProductList, Product, quantity);
                }

        } while (Full == true);

        System.out.println(ProductList);
        System.out.println("Amount of products is " + ProductList.size());
    }

    public static void addProduct (ArrayList list, String product, int quantity)
    {
        for (int i = 0; i < quantity; i++)
        {list.add(product);}
    }
}

