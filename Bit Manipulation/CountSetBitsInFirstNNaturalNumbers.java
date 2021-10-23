import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.println(solution(n));
  }

    static int maxPow2(int n){
        int i=0;
        
        while((1<<(i+1)) <= n){
            i++;
        }
        
        return i;
    }

  public static int solution(int n){
    if(n == 0)return 0;
    
    int i = maxPow2(n);
    
    int firstgroup = i * (1<<(i-1));
    int remainingLastBit = n - (1<<i) + 1;
    int faith = solution(n-(1<<i));
    
    return firstgroup + remainingLastBit + faith;
  }

}
