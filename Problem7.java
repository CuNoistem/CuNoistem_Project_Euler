import java.util.Arrays;
import java.util.Scanner;

class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit of the prime numbers: ");
        int limitLong = scanner.nextInt();
        int counterInt = 0;

        boolean primeArray[] = new boolean[limitLong + 1];
        Arrays.fill(primeArray, true);
        primeArray[0] = primeArray[1] = false;

        for (int counter = 2; (counter * counter <= limitLong); counter++) {
            if (primeArray[counter]) {
                for (int counter2 = counter; (counter * counter2) <= limitLong; counter2++) {
                    primeArray[counter * counter2] = false;
                }
            }
        }

        for (int counter = 0; counter <= limitLong; counter++) {
            if (primeArray[counter]) {
                counterInt++;
                if (counterInt == 10001) {
                    System.out.println(counter);
                    System.exit(0);
                }
            }
        }

        System.out.println("Not enough primes.");

        scanner.close();
    }
}
