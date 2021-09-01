import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int gcd = getGCD(num1, num2);
        int lcm = num1 * num2 / gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }

    public static int getGCD(int a, int b) {
        while(b > 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
}
