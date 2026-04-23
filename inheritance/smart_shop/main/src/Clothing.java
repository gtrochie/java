// 'Clothing' IS A 'Product'
public class Clothing extends Product {
    private String size;

    // The constructor must accept parent data (name, price)
    // and child data (size)
    public Clothing(String name, double price, String size) {
        // Send name and price up to the Product blueprint
        super(name, price);
        this.size = size;
    }

    // We override the parent's method to add our specific data
    @Override
    public void displayDetails() {
        // Option 1: Call the parent version to print name/price
        super.displayDetails();
        // Option 2: Add our specific size information
        System.out.println("Size: " + size);
    }
}