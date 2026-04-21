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
        if (waterLevel < 250){
            System.out.println("Need more water");
        }
        else if (beanWeight < 15){
            System.out.println("Need more Beans");
        }

        else{
            waterLevel -= 250;
            beanWeight -= 15;
            totalBrewedCount ++;
            System.out.printf("waterlevel remaining : %d\n",waterLevel);
            System.out.printf("beanWeight remaining: %d\n",beanWeight);
            System.out.println("Enjoy your coffee!");

        }

    }
    public int getRemainingCups() {
        int cups_bywater = waterLevel / 250;
        int cups_bybeans = beanWeight / 15;

        if (cups_bybeans > cups_bywater) {
            return cups_bywater;
        } else {
            return cups_bybeans;
        }

    }
}
