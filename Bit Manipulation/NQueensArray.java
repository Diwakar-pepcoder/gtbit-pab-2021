import java.io.*;
import java.util.*;

public class Main {

    static boolean isSafe(int row, int col, int cols[], int ndiag[], int rdiag[], int n){
        return cols[col] == 0 && ndiag[row+col] == 0 && rdiag[col-row+n-1] == 0;
    }

  public static void solution(boolean[][] board, int row, int cols[], int ndiag[], int rdiag[], String asf) {
        
        if(row == board.length){
            System.out.println(asf+".");
            return;
        }
        
        for(int col=0;col<board.length;col++){
            if(isSafe(row, col, cols, ndiag, rdiag, board.length)){
                
                cols[col] = 1;
                ndiag[row+col] = 1;
                rdiag[col-row+board.length-1] = 1;
                
                solution(board, row+1, cols, ndiag, rdiag, asf+row+"-"+col+", ");
                
                cols[col] = 0;
                ndiag[row+col] = 0;
                rdiag[col-row+board.length-1] = 0;
            }
        }
        
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    boolean[][] board = new boolean[n][n];
    int cols[] = new int[n];
    int ndiag[] = new int[2*n];// 2*n-1
    int rdiag[] = new int[2*n];
    solution(board, 0, cols, ndiag, rdiag, "");
  }

}
