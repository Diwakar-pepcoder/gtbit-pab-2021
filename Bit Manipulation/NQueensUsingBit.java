import java.io.*;
import java.util.*;

public class Main {

    static boolean isSafe(int row, int col, int cols, int ndiag, int rdiag, int n){
        return (cols & mask(col)) == 0 && (ndiag & mask(row+col)) == 0 && (rdiag & mask(col-row+n-1)) == 0;
    }
    
    static int mask(int i){
        return 1<<i;
    }

  public static void solution(boolean[][] board, int row, int cols, int ndiag, int rdiag, String asf) {
        
        if(row == board.length){
            System.out.println(asf+".");
            return;
        }
        
        for(int col=0;col<board.length;col++){
            if(isSafe(row, col, cols, ndiag, rdiag, board.length)){
                
                // toggle to set 1
                cols ^= mask(col);
                ndiag ^= mask(row+col);
                rdiag ^= mask(col-row+board.length-1);
                
                solution(board, row+1, cols, ndiag, rdiag, asf+row+"-"+col+", ");
                
                // toggle to set 0
                cols ^= mask(col);
                ndiag ^= mask(row+col);
                rdiag ^= mask(col-row+board.length-1);
            }
        }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    boolean[][] board = new boolean[n][n];
    int cols = 0;
    int ndiag= 0;// 2*n-1
    int rdiag = 0;
    solution(board, 0, cols, ndiag, rdiag, "");
  }

}
