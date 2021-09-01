import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            boolean chkPelindrome = true;
            String number = sc.next();

            if(number.equals("0")) {
                break;
            }

            for (int i = 0; i < number.length()/2 + 1; i++) {
                if(number.charAt(i) != number.charAt(number.length() - i - 1)) {
                    chkPelindrome = false;
                }
            }

            if (chkPelindrome) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
