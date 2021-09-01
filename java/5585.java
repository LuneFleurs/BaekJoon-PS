import java.util.Scanner;

public class Main {
    // 500 100 50 10 5 1
    private static int[] coins = {500, 100, 50, 10, 5, 1};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int changes = 1000 - sc.nextInt();
        sc.close();

        int num = calcChanges(changes);

        System.out.println(num);
    }

    public static int calcChanges (int change) {
        int num = 0;
        for (int i = 0; i < 6; i++) {
            if (change / coins[i] > 0) {
                num += change / coins[i];
                change = change % coins[i];
            }
        }
        return num;
    }
}
