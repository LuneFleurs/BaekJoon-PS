import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        int[] arr = new int[number];
        
        for (int i = 0; i < number; i++) {
            arr[i] = sc.nextInt();
        }
        
        sc.close();
        
        Arrays.sort(arr);
        System.out.print(arr[0] + " " + arr[number - 1]);
    }
}
