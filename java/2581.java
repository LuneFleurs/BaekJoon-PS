import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        int min = 10001;

        boolean arr[] = new boolean[n+1];
        // 0, 1 은 소수가 아님
        arr[0] = true;
        arr[1] = true;

        // 에라토스테네스의 체
        for(int i = 2; i < Math.sqrt(n+1); i++) {
            if (arr[i]) {   // 이미 체크된 경우는 스킵
                continue;
            }
            for(int j = i * i; j < arr.length; j += i) {
                arr[j] = true;
            }
        }

        for(int i = m; i < n + 1; i++) {
            if(arr[i] == false) {
                if(min > i) {
                    min = i;
                }
                sum += i;
            }
        }

        if(sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
