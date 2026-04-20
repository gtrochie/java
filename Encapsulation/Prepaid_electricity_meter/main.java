public class main {
    public static void main (String[] args){
        ElectricityMeter meter = new ElectricityMeter();
        meter.topUp(100.0);
        meter.useElectricity(10.0);
        System.out.println("Balance: " + meter.getUnitsBalance());
    }
}
