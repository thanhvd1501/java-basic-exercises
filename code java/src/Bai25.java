import java.util.Scanner;

public class Bai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();

        int sum = 0;
        System.out.println("Nhập " + n + " số nguyên:");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x < 0) continue; // bỏ qua số âm
            sum += x;
        }

        System.out.println("Tổng các số dương = " + sum);
        sc.close();
    }
}