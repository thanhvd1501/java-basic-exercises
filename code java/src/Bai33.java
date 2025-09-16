import java.util.Scanner;

public class Bai33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập 1 dòng: ");
        String s = sc.nextLine().trim();

        if (s.isEmpty()) {
            System.out.println("Số từ = 0");
        } else {
            String[] words = s.split("\\s+");
            System.out.println("Số từ = " + words.length);
        }

        sc.close();
    }
}