import java.util.Scanner;

class Problem2 {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);

        System.out.println("Enter the limit: ");
        long limitLong = scanner.nextLong();

        double golden_ratio = 1.61803398875;
        golden_ratio =  Math.pow(golden_ratio, 3);

        long fibonacci_even_term = 2;
        long sumLong =  0;

        while (fibonacci_even_term <= limitLong) {
            sumLong += fibonacci_even_term;
            fibonacci_even_term = Math.round(fibonacci_even_term * golden_ratio);
        }

        System.out.println(sumLong);
        scanner.close();
    }
}
