import java.util.Scanner;

public class Bai29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử n: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhập mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Nhập giá trị X: ");
        int X = sc.nextInt();

        int count = 0;
        for (int x : arr) {
            if (x == X) count++;
        }

        System.out.printf("%d xuất hiện %d lần\n", X, count);
        sc.close();
    }
}