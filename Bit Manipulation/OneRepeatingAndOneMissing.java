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
    
    for(int i=1;i<=arr.length;i++){
        xor ^= i;
    }
    
    // xor = repeating ^ missing
    int rsb = xor&-xor;
    
    int a = 0;
    int b = 0;
    
    for(int v: arr){
        if((v&rsb)==0){
            a ^= v;
        }else{
            b ^= v;
        }
    }
    
    for(int v=1;v<=arr.length;v++){
        if((v&rsb)==0){
            a ^= v;
        }else{
            b ^= v;
        }
    }
    
    for(int v: arr){
        if(v == a){
            System.out.println("Missing Number -> "+b);
            System.out.println("Repeating Number -> "+a);
            return;
        }
        if(v == b){
            System.out.println("Missing Number -> "+a);
            System.out.println("Repeating Number -> "+b);
            return;
        }
    }
   
   
  }

}
