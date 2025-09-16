import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();

        double avg = (d1 + d2 + d3) / 3.0;

        System.out.println("avg = " + avg);

        if (avg >= 8.5) {
            System.out.println("Giỏi");
        } else if (avg >= 6.5) {
            System.out.println("Khá");
        } else if (avg >= 5) {
            System.out.println("Trung bình");
        } else {
            System.out.println("Yếu");
        }
    }
}