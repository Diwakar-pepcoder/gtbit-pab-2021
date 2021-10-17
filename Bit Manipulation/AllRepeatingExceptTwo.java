import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < n; i++){
      arr[i] = scn.nextInt();
    }
    solution(arr);
  }

  public static void solution(int[] arr){
   //write your code here
   
    int xor = 0;
    
    for(int v: arr){
        xor ^= v;
    }
    
    int rsb = xor&-xor;
    
    int a=0;
    int b=0;
    
    for(int v: arr){
        if((v&rsb) == 0){
            a ^= v;
        }else{
            b ^= v;
        }
    }
   
    System.out.println(Math.min(a,b));
    System.out.println(Math.max(a,b));
    
  }

}
