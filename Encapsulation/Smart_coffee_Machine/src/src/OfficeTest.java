public class OfficeTest {
    public static void main(String[] args) {
        CoffeeMachine smeg = new CoffeeMachine();
        smeg.addWater(1500);
        smeg.addBeans(750);
        smeg.makeCoffee();
        System.out.println(smeg.getRemainingCups());
    }
}
