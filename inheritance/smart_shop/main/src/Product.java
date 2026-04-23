public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Product: " + name + " | Price: R" + price);
    }


    public String getName() { return name; }
    public double getPrice() { return price; }
}