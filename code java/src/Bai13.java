import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b (b >= 0): ");
        int b = sc.nextInt();

        long power = 1;
        for (int i = 1; i <= b; i++) {
            power *= a;
        }

        System.out.println(a + "^" + b + " = " + power);

        sc.close();
    }
}
