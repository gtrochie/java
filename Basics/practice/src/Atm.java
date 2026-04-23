import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        String userName = "Rotshidzwa";
        double balance = 5000;
        String action;
        double amount;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("\nHey " + userName + ", what would you like to do? (view, withdraw, deposit, quit): ");
            action = scanner.nextLine().toLowerCase();

            if (action.equals("quit")) break; 

            switch (action) {
                case "view":
                    System.out.println("Your balance is: R" + balance);
                    break;

                case "deposit":
                    System.out.print("How much to deposit: ");
                    amount = scanner.nextDouble();
                    scanner.nextLine(); 
                    
                    if (amount > 0 && amount % 50 == 0) {
                        balance += amount;
                        System.out.println("Success! New balance: R" + balance);
                    } else {
                        System.out.println("Error: Multiples of 50 only.");
                    }
                    break;

                case "withdraw":
                    System.out.print("How much to withdraw: ");
                    amount = scanner.nextDouble();
                    scanner.nextLine(); 
                    
                    if (amount <= balance && amount % 50 == 0) {
                        balance -= amount;
                        System.out.println("Success! Remaining balance: R" + balance);
                    } else {
                        System.out.println("Error: Insufficient funds or not a multiple of 50.");
                    }
                    break;

                default:
                    System.out.println("Action invalid.");
                    break;
            }
        } while (balance > 0);

        System.out.println("Thank you for using the ATM. Goodbye!");
        scanner.close();
    }
}