package compositePattern;

public class Product extends ProductCategory{

    public Product(int id, String name, int price)
    {
        super(id, name, price);
    }

    public void addProduct(ProductCategory product)
    {
        System.out.println("Product can not add Product");

        return;
    }

    public void removeProduct(ProductCategory product)
    {
        System.out.println("Product can not remove Product");

        return;
    }

    public int getCount()
    {
        System.out.println("Product get Count");

        return(0);
    }

    public String getName()
    {
        System.out.println("getName get Name");

        return(this.name);
    }

    public int getPrice()
    {
        System.out.println("Product get Price");
        return(this.price);
    }

    public int getId()
    {
        System.out.println("Product get Id");
        return(this.id);
    }
}
