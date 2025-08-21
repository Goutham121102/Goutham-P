import java.util.Scanner;

public class printOdd {
    public static void Odd(int n) {
        if (n % 2 == 0) {
            n = n - 1;
        }

        for (int i = 1; i <= 2 * n - 1; i += 2) {
            System.out.print(i);
            if (i < 2 * n - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        Odd(n);
    }
}
