import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    //write your code here
    
    // int rsb = n&-n;
    // if(n-rsb == 0){
    //     System.out.println(true);
    // }else{
    //     System.out.println(false);
    // }
    
    System.out.println((n&(n-1)) == 0);
    
  }

}
