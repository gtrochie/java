public class ShopTest {
    public static void main(String[] args) {

        Electronics laptop = new Electronics("MacBook", 25000.0, 12);

        Clothing hoodie = new Clothing("Python Hoodie", 450.0, "XL");

        System.out.println("--- Product 1 ---");
        laptop.displayDetails();
        laptop.printWarranty();

        System.out.println("\n--- Product 2 ---");
        hoodie.displayDetails();
    }
}