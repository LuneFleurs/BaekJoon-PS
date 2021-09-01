import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int weight = sc.nextInt();
        int count = 0;

        if (weight < 3 || (weight == 4 || weight == 7)) {
            count = -1;
        } else if (weight % 5 == 0) {
            count = weight/5;
        } else if (weight % 5 == 1 || weight % 5 == 3) {
            count = weight/5 + 1;
        } else if (weight % 5 == 2 || weight % 5 == 4) {
            count = weight/5 + 2;
        }
        System.out.println(count);
    }
}
