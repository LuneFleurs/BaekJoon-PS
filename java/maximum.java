import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }
        
        sc.close();
        
        int value = arr[0];
        int max = 0;
        int index = 0;
        
        for(int i = 0 ; i < 9 ; i++) {
            if(value > max) {
                max = value;
                index = (i + 1) ;
            }
        }
        System.out.print(max + "\n" + index);
    }
}
