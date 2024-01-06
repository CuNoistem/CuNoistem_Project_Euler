public class Problem5 {
    public static void main(String[] args) {
        Problem5 obj = new Problem5();
        double start = System.currentTimeMillis();

        long lcm = obj.LCM(20);
        System.out.println(lcm);

        double end = System.currentTimeMillis();
        System.out.println((end - start) / 1000);
    }

    long LCM(int n) {
        if (n == 2)
            return 2;
        else {
            long lcm = LCM(n - 1);
            for (int i = 1;; i++) {
                if ((lcm * i) % n == 0) {
                    return (lcm * i);
                }
            }
        }
    }
}
