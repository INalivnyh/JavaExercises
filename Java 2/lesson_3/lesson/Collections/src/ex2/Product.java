package ex2;

class Product
{
    private String name;
    private float  price;
    private float  quantity;

    public Product (String name, float price, float quantity)
    {
        this.name     = name;
        this.price    = price;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public float getQuantity() {
        return quantity;
    }
    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString()
    {
        return "Наименование '" + name + "', цена - " + String.valueOf (price) +
                ", количество - " + String.valueOf (quantity);
    }
}
