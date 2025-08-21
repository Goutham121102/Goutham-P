import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        double a = sc.nextDouble();

        System.out.print("Enter second number : ");
        double b = sc.nextDouble();

        System.out.print("Enter operation : ");
        String operation = sc.next();

        switch (operation) {
            case "add":
                System.out.println("Result: " + (a + b));
                break;
            case "sub":
                System.out.println("Result: " + (a - b));
                break;
            case "mul":
                System.out.println("Result: " + (a * b));
                break;
            case "div":
                if (b != 0)
                    System.out.println("Result: " + (a / b));
                else
                    System.out.println("Error: Division by zero!");
                break;
            default:
                System.out.println("Invalid operation!");
        }
    }
}
