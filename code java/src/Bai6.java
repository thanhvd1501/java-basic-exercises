import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tháng (1-12): ");
        int month = sc.nextInt();
        int days;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                days = 28;
                break;
            default:
                days = 0;
        }
        if (days > 0)
            System.out.println("Tháng " + month + " có " + days + " ngày.");
        else
            System.out.println("Tháng không hợp lệ.");
    }
}