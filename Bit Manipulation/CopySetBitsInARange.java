import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    int left = scn.nextInt();// 3
    int right = scn.nextInt();// 5

   //write your code here
   
    int mask = 1 << (right-left+1);// 0001000
    mask = mask-1;// 0000111
    mask = mask << (left-1);// 0011100
    mask = a&mask;// 00101000
    int ans = b|mask;
    
    System.out.println(ans);
    
  }

}
