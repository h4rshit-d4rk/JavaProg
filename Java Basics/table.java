import java.util.Scanner;

public class table {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of y: ");
        int y = sc.nextInt();
        for (int i = 1; i <= y; i++) {
            System.out.println(x + " x " + i + " = " + x * i);
        }
    }
}
