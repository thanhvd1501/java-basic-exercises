import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập số dương: ");
            n = sc.nextInt();
        } while (n <= 0);
        System.out.println("Bạn đã nhập đúng: " + n);
    }
}