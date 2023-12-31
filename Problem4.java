public class Problem4 {
    public static void main(String[] args) {
        Problem4 obj = new Problem4();
        int maxInt = 0;

        double start = System.currentTimeMillis();

        for (int counter1 = 90; counter1 >= 10; counter1--) {
            for (int counter2 = 999; counter2 >= 100; counter2--) {
                if (obj.checkPalindrome(counter1 * counter2 * 11)) {
                    if (counter1 * counter2 * 11> maxInt)
                        maxInt = counter1 * counter2 * 11;
                }
            }
        }  
        
        System.out.println(maxInt);

        double end = System.currentTimeMillis();
        System.out.println((end - start) / 1000);
    }

    boolean checkPalindrome(int numberInt) {
        int checkInt = numberInt;
        int newNumberInt = 0;
        while (numberInt != 0) {
            newNumberInt = (newNumberInt * 10) + (numberInt % 10);
            numberInt /= 10;
        }

        return (checkInt == newNumberInt);
    }
}
