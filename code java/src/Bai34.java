import java.util.Scanner;

public class Bai34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();

        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println("Chuỗi đảo ngược: " + reversed);

        sc.close();
    }
}