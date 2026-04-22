public class BankTest {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Rochie", 2000000000);
        BankAccount account2 = new BankAccount("Scott");
        BankAccount account3 = new BankAccount("Lolly", -2500);

        System.out.println("--- Transaction 1: Rochie ---");
        account1.withdraw(250000);

        System.out.println("\n--- Transaction 2: Lolly (Safety Check) ---");

        account3.withdraw(100);


        System.out.println("\n--- Final Balances ---");
        System.out.println("Rochie: R" + account1.getbalance());
        System.out.println("Scott: R" + account2.getbalance());
        System.out.println("Lolly: R" + account3.getbalance());
    }
}