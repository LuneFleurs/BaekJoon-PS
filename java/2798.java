import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int res = 0;

        int[] arr = new int[100];

        Scanner sc = new Scanner(System.in);
        int card = sc.nextInt();
        int max = sc.nextInt();
        for (int i = 0; i < card; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        for (int i = 0; i < card - 2; i++) {
            for (int j = i + 1; j < card - 1; j++) {
                for (int k = j + 1; k < card; k++) {
                    int temp = arr[i] + arr[j] + arr[k];

                    if(temp <= max) {
                        if (temp > res) {
                            res = temp;
                        }
                    }
                }
            }
        }
        System.out.println(res);
    }
}
