public class ElectricityMeter {
    private double unitsBalance;

    public ElectricityMeter(){
        this.unitsBalance = 0.0;
    }
    public void topUp(double amount){
        if (amount > 0){
            unitsBalance += amount;
        }
        else {
            System.out.println("you can't un-buy electricity");
        }
    }
    public void useElectricity (double amount){
        if (amount > 0 && unitsBalance >= amount){
            unitsBalance -= amount;
        }
        else{
            System.out.println("you don't have enough electricity");
        }
    }
    public double getUnitsBalance(){

        return unitsBalance;
    }
}