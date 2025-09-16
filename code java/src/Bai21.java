import java.util.Scanner;

public class Bai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int N = sc.nextInt();

        int even = 0, odd = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) even++;
            else odd++;
        }

        System.out.printf("N=%d → Even=%d, Odd=%d\n", N, even, odd);
        sc.close();
    }
}