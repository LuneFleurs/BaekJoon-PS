import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cnt = sc.nextInt();
        int[] arr = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            arr[i] = getLcm(a, b);
        }

        for (int i = 0; i < cnt; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int getGcd (int a, int b) {
            if (a < b) {
                int temp = a;
                a = b;
                b = temp;
            }

            while(b > 0) {
                int temp = a;
                a = b;
                b = temp % a;
            }

        return a;
    }

    public static int getLcm (int a, int b) {
        return a * b / getGcd(a, b);
    }
}
