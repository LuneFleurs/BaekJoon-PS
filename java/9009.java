import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int idx = sc.nextInt();
        int[] resArr = new int[idx]; // 100 200 12345 1003

        for (int i = 0; i < idx; i++) {
            resArr[i] = sc.nextInt();
        }

        for (int i = 0; i < resArr.length; i++) {
            int[][] clacedArr = CalcResult(resArr);
            Arrays.sort(clacedArr[i]);
            for (int k = 0; k < clacedArr[i].length; k++) {
                if(clacedArr[i][k] != 0) {
                    System.out.print(clacedArr[i][k] + " ");
                }
            }
            System.out.println();
        }

    }

    public static int[] Fibonacci(int idx) {
        int[] fibonacciArr = new int[idx + 1];
        fibonacciArr[0] = 0;

        if (idx >= 1) {
            fibonacciArr[1] = 1;
            for (int i = 2; i <= idx; i++) {
                fibonacciArr[i] = fibonacciArr[i-1] + fibonacciArr[i-2];
            }
        }
        return fibonacciArr;
    }

    public static int[][] CalcResult (int[] resArr) {
        // 1 < n < 1,000,000,000
        int[] fiboArr = Fibonacci(45);
        int[][] fiboArr2 = new int[resArr.length][45];
        for (int i = 0; i < resArr.length; i++) {
            int compare = resArr[i];
            int cnt = 0;
            for (int j = 44; j >= 0; j--) {
                if (fiboArr[j] <= compare) {
                    fiboArr2[i][cnt] = fiboArr[j];
                    compare -= fiboArr[j];
                    cnt++;
                }
            }
        }
        return fiboArr2;
    }
}
