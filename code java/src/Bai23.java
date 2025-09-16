import java.util.Scanner;

public class Bai23 {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập X: ");
        int X = sc.nextInt();

        int num = X + 1;
        while (true) {
            if (isPrime(num)) {
                System.out.printf("Số nguyên tố đầu tiên lớn hơn %d là %d\n", X, num);
                break;
            }
            num++;
        }
        sc.close();
    }
}