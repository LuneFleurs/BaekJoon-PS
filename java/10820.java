import java.util.Scanner;

public class Main {
    // 소문자 대문자 숫자 공백 순서
    // This is String -> 10 2 0 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int small = 0;
            int cap = 0;
            int num = 0;
            int space = 0;

            String line = sc.nextLine();
            for(int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if ('A' <= c && c <= 'Z') {
                    cap++;
                } else if ('a' <= c && c <= 'z') {
                    small++;
                } else if ('0' <= c && c <= '9') {
                    num++;
                } else if (c == ' ') {
                    space++;
                }
            }
            System.out.println(small + " " + cap + " " + num + " " + space);
        }
    }
}
