import java.util.Scanner;

public class Bai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập N: ");
        int n = sc.nextInt();

        System.out.print("Các số chẵn từ 0 đến " + n + ": ");
        for (int i = 0; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
