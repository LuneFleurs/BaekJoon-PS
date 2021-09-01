import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] people = new int [num];

        for (int i = 0; i < num; i++) {
            people[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(people);

        int sum = 0;

        for (int i = 0; i < num; i++) {
            sum += people[i]*(num-i);
        }
        System.out.println(sum);
    }
}
