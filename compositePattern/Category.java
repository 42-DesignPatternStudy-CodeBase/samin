package compositePattern;

import java.util.ArrayList;

public class Category extends ProductCategory {
    ArrayList<ProductCategory> list = new ArrayList<>();

    public Category(int id, String name, int price)
    {
        super(id, name, price);
    }

    public void addProduct(ProductCategory product)
    {
        System.out.println("Category add Product");
        list.add(product);
    }

    public void removeProduct(ProductCategory product)
    {
        System.out.println("Category remove Product");

        list.remove(product);
    }

    public int getCount()
    {
        System.out.println("Category get Count");

        return(list.size());
    }

    public String getName()
    {
        System.out.println("Category get Name");

        return(this.name);
    }

    public int getPrice()
    {
        System.out.println("Category get Price");

        int listSize = list.size();
        int price = 0;

        for (int i = 0; i < listSize; i++)
            price += list.get(i).getPrice();
        return(price);
    }

    public int getId()
    {
        System.out.println("Category get Id");

        return(this.id);
    }
}
