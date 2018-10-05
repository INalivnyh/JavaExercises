package ex2;

import java.util.Comparator;

class SortedByName implements Comparator<Product>
{
    public int compare(Product obj1, Product obj2)
    {
        String str1 = obj1.getName();
        String str2 = obj2.getName();

        return str1.compareTo(str2);
    }
}

// сортировка по цене
class SortedByPrice implements Comparator<Product>
{
    public int compare(Product obj1, Product obj2)
    {
        float price1 = obj1.getPrice();
        float price2 = obj2.getPrice();

        if (price1 > price2) {
            return 1;
        } else if (price1 < price2) {
            return -1;
        } else {
            return 0;
        }
    }
}
