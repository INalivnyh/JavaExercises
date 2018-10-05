package ex2;

import java.util.Arrays;

public class Example
{
    public static void main(String[] args)
    {
        Product[] products = new Product[3];

        // заполним объект Product содержимым
        products[0] = new Product("Молоко", (float) 35.56, (float)900.00);
        products[1] = new Product("Кофе"  , (float)199.50, (float) 90.00);
        products[2] = new Product("Чай"   , (float) 78.50, (float)150.00);

        // выведем данные без сортировки
        System.out.println("~~~~~ без сортировки ~~~~~");
        for(Product product : products)
            System.out.println(product.toString());

        // Сортировка по цене
        Arrays.sort(products, new SortedByPrice());
        System.out.println("\n~~~~~ сортировка по цене ~~~~~");

        for(Product product : products)
            System.out.println(product.toString());

        // Сортировка по названию
        Arrays.sort(products, new SortedByName());
        System.out.println("\n~~~~~ сортировка по названию ~~~~~");

        for(Product product : products)
            System.out.println(product.toString());
    }
}
