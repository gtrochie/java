public class BankAccount {
    private String accountHolder;
    private int balance;

    public BankAccount(String accountHolder){
        this.accountHolder = accountHolder;
        this.balance = 0;
    }
    public BankAccount(String accountHolder, int balance){
        this.accountHolder = accountHolder;
        if (balance > 0){
            this.balance = balance;
        }
        else {
            this.balance = 0;
        }
    }
    public void deposit (int amount){
        if (amount > 0){
            balance += amount;
        }
        else {
            System.out.println("error : cannot deposit a negative amount");
        }
    }

    public void withdraw(int amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrew: R" + amount + " your remaining balance is " + balance);
        }
        else{
            System.out.println("BLOCKED: insufficient funds");
        }
    }

    public int getbalance(){
        return balance;
    }
}
