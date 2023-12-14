import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the threshold : ");
        int numInteger = scanner.nextInt();
        numInteger = numInteger - 1;
        int sumInteger = 0;

        if (numInteger > 0) {
            int n3 = (int) Math.floor(numInteger / 3);
            int n5 = (int) Math.floor(numInteger / 5);
            int n15 = (int) Math.floor(numInteger / 15);

            for (int counter = 1; counter <= n3; counter++) {
                if (counter <= n15)
                    sumInteger = sumInteger - (7 * counter);
                else if (counter <= n5)
                    sumInteger = sumInteger + (8 * counter);
                else
                    sumInteger = sumInteger + (3 * counter);
            }

            System.out.println(sumInteger);
        }

        scanner.close();
    }
}
