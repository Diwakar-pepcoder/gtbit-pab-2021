import java.io.*;
import java.util.*;

public class Main {

  public static long solution(int[] arr){
    
    long ans=0;
    
    for(int i=0;i<32;i++){
        int mask = 1<<i;
        
        long zero=0;
        long one=0;
        
        for(int val: arr){
            if((val&mask) == 0){
                zero++;
            }else{
                one++;
            }
        }
        
        ans += zero*one*2;
    }
    
    return ans;
  }

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < arr.length; i++){
      arr[i] = scn.nextInt();
    }
    System.out.println(solution(arr));
  }

}
