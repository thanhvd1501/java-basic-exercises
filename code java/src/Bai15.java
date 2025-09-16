import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương n: ");
        int n = sc.nextInt();

        int sum = 0, tmp = n;
        while (tmp > 0) {
            sum += tmp % 10;
            tmp /= 10;
        }

        System.out.println("Tổng các chữ số của " + n + " là: " + sum);

        sc.close();
    }
}
