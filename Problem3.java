import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number for prime factorization: ");
        long numberLong = scanner.nextLong();
        int largest_prime_factor = 2;

        double start = System.currentTimeMillis();

        if (numberLong % largest_prime_factor == 0)
            numberLong /= largest_prime_factor;
        largest_prime_factor++;

        while (numberLong >= largest_prime_factor) {
            if (numberLong % largest_prime_factor == 0) {
                numberLong /= largest_prime_factor;
                largest_prime_factor += 2;
            } else {
                largest_prime_factor += 2;
            }
        }

        System.out.println(largest_prime_factor - 2);

        scanner.close();

        double end = System.currentTimeMillis();
        System.out.println((end - start) / 1000);
    }
}
