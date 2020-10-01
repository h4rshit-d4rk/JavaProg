import java.util.Scanner;

public class power {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of y: ");
        int y = sc.nextInt();
        int r = x;
        if (y == 0) {
            System.out.println(x + "^" + y + "= 1");
            return;
        }
        for (int i = 2; i <= y; i++) {
            r *= x;
        }
        System.out.println(x + "^" + y + "= " + r);
    }

}
