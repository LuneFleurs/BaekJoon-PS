import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 1;
        int radius = 0;
        int width = 0;
        int height = 0;

        while(true) {
            radius = sc.nextInt();
            if (radius == 0) {
                break;
            }
            width = sc.nextInt();
            height = sc.nextInt();

            int r = radius * 2;
            int w = (int) Math.pow(width, 2);
            int h = (int) Math.pow(height, 2);

            if (r >= Math.sqrt(w + h)) {
                System.out.println("Pizza " + count + " fits on the table.");
            } else {
                System.out.println("Pizza " + count + " does not fit on the table.");
            }
            count++;
        }
        sc.close();
    }
}
