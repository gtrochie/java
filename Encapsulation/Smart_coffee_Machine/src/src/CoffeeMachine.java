public class CoffeeMachine {
    private int waterLevel;
    private int beanWeight;
    private int totalBrewedCount;

    public CoffeeMachine(){
        this.waterLevel = 0;
        this.beanWeight = 0;
        this.totalBrewedCount = 0;

    }

    public void addWater(int ml){
        if (ml > 1000){
            waterLevel = 1000;
        }
        else {
            waterLevel += ml;
        }
    }
    public void addBeans(int grams){
        if (grams > 500){
            beanWeight = 500;
        }
        else {
            beanWeight += grams;
        }
    }
    public void makeCoffee(){
        if (waterLevel >= 250 && beanWeight >= 15){
            System.out.println("making coffee");

        }
        else {
            System.out.println("Refill required!");
        }
    }


}
