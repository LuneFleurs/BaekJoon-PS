import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        //int row = sc.nextInt();
        //int column = sc.nextInt();
        int row = Integer.parseInt(st.nextToken());
        int column = Integer.parseInt(st.nextToken());

        char [][] chessBoard = new char[row][column];
        int minimum = Integer.MAX_VALUE;

        // generate input chessboard
        for (int x = 0; x < row; x++) {
            //String currentLine = sc.nextLine();
            String currentLine = br.readLine();
            //System.out.println(currentLine.length());
            for (int y = 0; y < currentLine.length(); y++) {
                chessBoard[x][y] = currentLine.charAt(y);
                //System.out.print(chessBoard[x][y]);
            }
            //System.out.printf("\n");
        }

        // -7 for 8x8 size
        for(int x = 0; x < row - 7; x++) {
            for (int y = 0; y < column -7; y++) {
                minimum = Math.min(minimum, checkBw(x, y, chessBoard));
            }
        }

        System.out.println(minimum);
    }

    private static int checkBw(int x, int y, char[][] board) {
        int result = 0;
        char temp = 'B';

        for(int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if (board[i][j] != temp) {
                    result++;
                }
                if (temp == 'B') {
                    temp = 'W';
                } else {
                    temp = 'B';
                }
            }
            if (temp == 'B') {
                temp = 'W';
            } else {
                temp = 'B';
            }
        }

        if (result > 32) {
            result = 64 - result;
        }

        return result;
    }
}
