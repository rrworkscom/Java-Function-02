package Meeting14;

import java.util.Scanner;

public class PrimeCheckingRecursive20 {

    static boolean isPrime(int n, int divisor) {
        if (n <= 1) {
            return false;           
        }
        if (divisor == 1) {
            return true;            
        }

        if (n % divisor == 0) {
            return false;
        }

        return isPrime(n, divisor - 1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input number: ");
        int n = input.nextInt();

        if (isPrime(n, n - 1)) {
            System.out.println(n + " is a PRIME number.");
        } else {
            System.out.println(n + " is NOT a prime number.");
        }
    }
}
