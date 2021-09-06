import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String res = "";
            int[] lines = new int[3];
            lines[0] = sc.nextInt();
            lines[1] = sc.nextInt();
            lines[2] = sc.nextInt();

            if(lines[0] == 0 && lines[1] == 0 && lines [2] == 0) {
                break;
            }

            Arrays.sort(lines);

            if(lines[2] >= lines[1] + lines[0]) {
                res = "Invalid";
            } else {
                if (lines[0] == lines[1] && lines[1] == lines[2]) {
                    res = "Equilateral";
                } else if ((lines[0] == lines[1] && lines[1] != lines[2]) || (lines[0] == lines[2] && lines[1] != lines[2]) || (lines[1] == lines[2] && lines[0] != lines[1])) {
                    res = "Isosceles";
                } else {
                    res = "Scalene";
                }
            }

            System.out.println(res);
        }

        sc.close();
    }
}
