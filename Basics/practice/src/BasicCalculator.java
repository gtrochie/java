import java.util.Scanner;
public class BasicCalculator{
    public static void main(String[] args) {
        // make a basic calculator
        double x;
        double y;
        char operator;
        double z;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        x = scanner.nextDouble();

        System.out.print("Enter the operator: ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        y = scanner.nextDouble();

        if (operator == '+'){
            z = x + y;
            System.out.printf("the answer is %.2f\n",z);
        }
        
        else if (operator == '-'){
            z = x - y;
            System.out.printf("the answer is %.2f\n",z);
        }
        
        else if (operator == '*'){
            z = x * y;
            System.out.printf("the answer is %.2f\n",z);
        }

        else if (operator == '/'){
            if (y == 0){
                  System.out.println("you cannot divide by zero, zero division error");
            }
            else {
                z = x / y;
                System.out.printf("the division of x and y is %.2f\n",z);
            }
        }

        else {
            System.out.println("operator is invalid");
        }
    }
    
}  