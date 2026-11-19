public class Primes1 {
    public static void main(String[] args) {
        for (int n = 2; n <= 500; n++) {
            boolean prime = true;

            for (int d = 2; d < n; d++) {
                if (n % d == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.println(n);
            }
        }
    }
}