package Meeting14;

public class FibonacciGuineaPig {

    static int fibonacci(int month) {
        if (month == 1 || month == 2) {
            return 1;   
        } else {
            return fibonacci(month - 1) + fibonacci(month - 2);
        }
    }

    public static void main(String[] args) {

        int month = 12;

        int totalPairs = fibonacci(month);

        
        System.out.println("Total month: "
                            + month);
        System.out.println("Total pairs of guinea pigs: "
                            + totalPairs);
    }
}
