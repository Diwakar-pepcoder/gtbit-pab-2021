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
   
   int o=0;
   int t=0;
   
   for(int v: arr){
       int oo = (~t&o&~v) | (~t & ~o & v);
       int tt = (t&~o&~v) | (~t & o & v);
       
       o = oo;
       t = tt;
   }
   
   System.out.println(o);
  }

}
