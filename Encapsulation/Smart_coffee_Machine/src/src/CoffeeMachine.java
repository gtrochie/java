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

}
