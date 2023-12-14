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

            sumInteger += ((n3 * (3 + (n3 * 3))) + (n5 * (5 + (n5 * 5))) - (n15 * (15 + (n15 * 15)))) / 2;

            System.out.println(sumInteger);
        }

        scanner.close();
    }
}
