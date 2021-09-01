import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sun = sc.nextInt();
        int water = sc.nextInt();
        sc.close();

        int answer = (int) (sun + water + Math.floor(Math.min(sun, water)) / 10);

        System.out.println(answer);
    }
}
