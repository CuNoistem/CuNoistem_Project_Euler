package Project_Euler;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of terms: ");
        int n = scanner.nextInt();

        double start = System.currentTimeMillis();

        System.out.println((n * ((3 * n) + 2) * ((n * n) - 1)) / 12);

        scanner.close();

        double end = System.currentTimeMillis();
        System.out.println((end - start) / 1000);
    }
}
