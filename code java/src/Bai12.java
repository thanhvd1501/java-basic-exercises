import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n (0..12): ");
        int n = sc.nextInt();

        long gt = 1;
        for (int i = 1; i <= n; i++) {
            gt *= i;
        }
        System.out.println(n + "! = " + gt);
    }
}

