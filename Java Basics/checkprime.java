import java.util.Scanner;

public class checkprime {

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
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        if (isPrime(x)) {
            System.out.println(x + " is a prime number.");
        } else {
            System.out.println(x + " is not prime");
        }

    }
}
