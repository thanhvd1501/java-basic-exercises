import java.util.Scanner;

public class Bai28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử n: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhập mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0], max = arr[0];
        for (int x : arr) {
            if (x < min) min = x;
            if (x > max) max = x;
        }

        System.out.printf("min = %d, max = %d\n", min, max);
        sc.close();
    }
}