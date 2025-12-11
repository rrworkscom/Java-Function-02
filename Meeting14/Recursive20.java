package Meeting14;

public class Recursive20 {
   
    public static int factorialRecursive(int n) {
        if (n == 1){
             return 1;
        } else {
            return n*factorialRecursive(n - 1);
        }
    }

    public static int factorialIterative(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorialIterative(n - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!!!");
        System.out.println(factorialRecursive(5));
        System.out.println(factorialIterative(5));
    }
    
}
