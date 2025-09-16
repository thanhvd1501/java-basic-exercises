import java.util.Scanner;

public class Bai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập M: ");
        int m = sc.nextInt();

        double sum = 0;
        for (int i = 1; i <= m; i++) {
            System.out.print("Nhập số thực thứ " + i + ": ");
            double x = sc.nextDouble();
            sum += x;
        }

        double avg = sum / m;
        System.out.println("Trung bình cộng = " + avg);

        sc.close();
    }
}
