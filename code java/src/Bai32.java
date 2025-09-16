import java.util.Scanner;

public class Bai32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine().toLowerCase();

        int count = 0;
        for (char c : s.toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) count++;
        }

        System.out.println("Số nguyên âm = " + count);
        sc.close();
    }
}