import java.util.Scanner;

public class Bai24 {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int N = sc.nextInt();

        int sum = 0;
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) sum += i;
        }

        System.out.printf("Tổng các số nguyên tố ≤ %d = %d\n", N, sum);
        sc.close();
    }
}