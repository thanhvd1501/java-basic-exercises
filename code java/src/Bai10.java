import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int N = sc.nextInt();

        while (N > 0) {
            System.out.print(N + " ");
            N--;
        }
    }
}
