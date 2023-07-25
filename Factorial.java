import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= number; ++i) {
            fact *= i;
        }
        System.out.printf("Factorial of %d = %d", number, fact);
    }
}