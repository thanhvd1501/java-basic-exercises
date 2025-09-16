import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương n: ");
        int n = sc.nextInt();

        int count = 0, tmp = n;
        if (tmp == 0) count = 1;
        while (tmp > 0) {
            count++;
            tmp /= 10;
        }

        System.out.println("Số chữ số của " + n + " là: " + count);

        sc.close();
    }
}
