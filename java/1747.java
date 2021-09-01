import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int max = Integer.MAX_VALUE;
        /*
        boolean arr[] = new boolean[min];
        // 0, 1 은 소수가 아님
        arr[0] = true;
        arr[1] = true;

        // 에라토스테네스의 체
        for(int i = 2; i < Math.sqrt(min); i++) {
            if (arr[i]) {   // 이미 체크된 경우는 스킵
                continue;
            }
            for(int j = i * i; j < arr.length; j += i) {
                arr[j] = true;
            }
        }
        */

        for (int i = m; i < max; i++) {
            if (isPrime(i) && isPalindrome(i) /*&& arr[i] == false*/) {
                System.out.print(i);
                break;
            }
        }
    }

    public static boolean isPalindrome(int n) {
        String strInt = Integer.toString(n);
        int len = strInt.length();

        for(int i = 0; i < len / 2; i++) { // 123454321
            if (strInt.charAt(i) != strInt.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
