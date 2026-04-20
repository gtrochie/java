public class ElectricityMeter {
    private double unitsBalance;

    public ElectricityMeter(double unitsBalance){
        this.unitsBalance = 0.0;
    }
    public void Topup(double amount){
        if (amount > 0){
            unitsBalance += amount;
        }
        else {
            System.out.println("you can't un-buy electricity");
        }
    }
    public void useElectricity (double amount){
        if (unitsBalance > amount){
            unitsBalance -= amount;
        }
        else{
            System.out.println("you don't have enough electricity");
        }
    }
}