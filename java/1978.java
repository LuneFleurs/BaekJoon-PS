import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int cnt = 0;

        while(st.hasMoreTokens()) {
            boolean chkPrime = true;
            int num = Integer.parseInt(st.nextToken());

            if (num == 1) {
                continue;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        chkPrime = false;
                        break;
                    }
                }
            }
            if (chkPrime) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
