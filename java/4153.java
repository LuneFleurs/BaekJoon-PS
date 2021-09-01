import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a == 0 && b == 0 && c == 0) {
                break;
            }

            arr.add(chkRightTriangle(a, b, c));
        }

        for (Integer value : arr) {
            if (value == 1) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }

    public static int chkRightTriangle(int a, int b, int c) {
        int[] tempArr = new int[3];
        tempArr[0] = a;
        tempArr[1] = b;
        tempArr[2] = c;

        int[] sortedArr = sort(tempArr);


        if (Math.pow(sortedArr[2], 2) == Math.pow(sortedArr[1], 2) + Math.pow(sortedArr[0], 2)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }

        return arr;
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
