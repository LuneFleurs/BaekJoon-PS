import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int min = 100;
        boolean chkOdd = false;
        for (int i = 0; i < 7; i++) {
            int num = sc.nextInt();
            if (num % 2 != 0) {
                sum += num;
                if (num < min) {
                    min = num;
                }
                chkOdd = true;
            }
        }
        if (chkOdd) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println("-1");
        }
    }
}
