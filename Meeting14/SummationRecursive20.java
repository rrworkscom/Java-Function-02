package Meeting14;

import java.util.Scanner;

public class SummationRecursive20 {

    static int sumRecursive(int n) {
        if (n == 1) {
            System.out.print("1");
            return 1; 
        } else {
            System.out.print(n + " + ");
            return n + sumRecursive(n - 1); 
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input number: ");
        int n = input.nextInt();

        int result = sumRecursive(n);
        System.out.println(" = " + result);
    }
}
