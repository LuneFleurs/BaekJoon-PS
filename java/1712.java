import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // str.nextToken() -> 공백 단위로 구분
        StringTokenizer str = new StringTokenizer(br.readLine());

        int fixedCost = Integer.parseInt(str.nextToken());
        int variableCost = Integer.parseInt(str.nextToken());
        int price = Integer.parseInt(str.nextToken());
        //int times = (fixedCost / (price - variableCost)) + 1;

        if(price > variableCost) {
            System.out.println((fixedCost / (price - variableCost)) + 1);
        } else {
            System.out.println(-1);
        }
    }
}
