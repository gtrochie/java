public class WalletTest {
    public static void main(String[] args) {
        DigitalWallet capiWallet = new DigitalWallet( "Ndivhuwo");
        capiWallet.deposit(5000);
        capiWallet.withdraw(2500);
        capiWallet.getBalance();
    }
}
