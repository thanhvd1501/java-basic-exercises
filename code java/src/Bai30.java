import java.util.Scanner;

public class Bai30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử n: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhập mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0, count = 0;
        for (int x : arr) {
            if (x % 2 == 0) {
                sum += x;
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No even");
        } else {
            double avg = (double) sum / count;
            System.out.printf("Trung bình số chẵn = %.2f\n", avg);
        }

        sc.close();
    }
}