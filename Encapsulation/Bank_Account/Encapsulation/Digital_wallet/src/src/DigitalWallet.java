public class DigitalWallet {
    private double balance;
    private String owner;

    public DigitalWallet(String owner){
        this.balance = 0.0;
        this.owner = owner;

    }
    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("R" + amount + " was deposited into your account, your new balance is R" + balance);;
        }
        else {
            System.out.println("You cannot deposit a negative amount");
        }
    }
    public void withdraw (double amount){
        if (amount > 0 && amount < balance){
            balance -= amount;
            System.out.println("R" + amount + " has been withdrawn from your account, your new balance is R" + balance);;
        }
        else {
            System.out.println("insufficient funds");
        }
    }
    public double getBalance(){
        return balance;
    }
}
