
public class Electronics extends Product {
    private int warrantyMonths;

    public Electronics(String name, double price, int warrantyMonths) {

        super(name, price);
        this.warrantyMonths = warrantyMonths;
    }

    public void printWarranty() {
        System.out.println("This item has a " + warrantyMonths + "-month warranty.");
    }
}