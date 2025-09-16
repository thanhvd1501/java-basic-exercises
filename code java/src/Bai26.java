import java.util.Scanner;

public class Bai26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Nhập dãy số (kết thúc khi nhập số âm): ");
        while (true) {
            int x = sc.nextInt();
            if (x < 0) break;
            sum += x;
        }

        System.out.println("Tổng = " + sum);
        sc.close();
    }
}