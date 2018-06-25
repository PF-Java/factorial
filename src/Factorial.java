import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial calculation program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to calculation program N: ");
        long N = scanner.nextLong();

        long fact = factorial(N);
        System.out.println("The factorial of N is: " + fact);
    }

    public static long factorial (long N) {
        if (N <= 0)
            return 1;
        return N * factorial(N - 1);
        }
}
