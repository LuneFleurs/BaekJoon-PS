import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idx = sc.nextInt();

        //System.out.println(Fibonacci(idx));
        System.out.println(Fibonacci2(idx));
    }

    public static int Fibonacci(int idx) {
        if(idx <= 1) {
            return idx;
        } else {
            return Fibonacci(idx - 1) + Fibonacci(idx - 2);
        }
    }

    public static int Fibonacci2(int idx) {
        int[] fibonacciArr = new int[idx + 1];
        fibonacciArr[0] = 0;

        if (idx >= 1) {
            fibonacciArr[1] = 1;
            for (int i = 2; i <= idx; i++) {
                fibonacciArr[i] = fibonacciArr[i-1] + fibonacciArr[i-2];
            }
        }
        return fibonacciArr[idx];
    }
}
