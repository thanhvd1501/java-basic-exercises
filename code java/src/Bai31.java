import java.util.Scanner;

public class Bai31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử n: ");
        int n = sc.nextInt();

        double[] arr = new double[n];
        System.out.println("Nhập mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }

        double sum = 0;
        for (double x : arr) {
            sum += x;
        }

        double avg = sum / n;
        System.out.printf("Trung bình = %.2f\n", avg);
        sc.close();
    }
}