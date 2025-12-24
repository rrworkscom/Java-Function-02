package Meeting14;

import java.util.Scanner;

public class DescendingSequenceRecursive20 {

    static void printDescendingRecursive(int n) {
        if (n < 0) {
            return;  
        }
        System.out.print(n + " ");
        printDescendingRecursive(n - 1); 
    }

    static void printDescendingIterative(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input number: ");
        int n = input.nextInt();

        System.out.println("\nDescending sequence using RECURSIVE:");
        printDescendingRecursive(n);

        System.out.println("\n\nDescending sequence using ITERATIVE:");
        printDescendingIterative(n);

        System.out.println();
    }
}
