import java.util.Scanner;

public class prime {

    public static boolean isPrime(int x) {
        if (x <= 1) {
            return false;
        }
        if (x <= 3) {
            return true;
        }
        for (int i = 2; i <= (int) Math.sqrt(x) + 1; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = x + 1; count != n; i++) {
            if (isPrime(i)) {
                count += 1;
            }
            if (count == n) {
                System.out.println(i);
            }
        }
    }
}
