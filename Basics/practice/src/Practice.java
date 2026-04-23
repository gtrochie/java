import  java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the first number: ");
        double a = scanner.nextDouble();
        System.out.print("enter the operator: ");
        char operator = scanner.next().charAt(0);
        System.out.print("enter the second number: ");
        double b = scanner.nextDouble();
        calculator(a,b,operator);
    }

    public static void calculator(double a, double b, char operator) {
        double answer = 0;

        switch (operator) {
            case '+':
                answer = add(a, b);
                break;
            case '-':
                answer = subtract(a, b);
                break;
            case '*':
                answer = multiply(a, b);
                break;
            case '/':
                answer = divide(a, b);
                break;
            default:
                System.out.println("invalid operator");
                return; 
        }
        System.out.printf("%.2f %c %.2f = %.2f \n",a,operator,b,answer);
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("zero division error");
            return 0;
        } else {
            return a / b;
        }
    }

    public static double multiply(double a, double b) {
        return a * b;
    }
}


