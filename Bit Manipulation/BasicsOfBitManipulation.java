import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int i = scn.nextInt();
    int j = scn.nextInt();
    int k = scn.nextInt();
    int m = scn.nextInt();
    
    //write your code here
    
    int onmask = (1<<i);
    int ofmask = ~(1<<j);
    int tmask = (1<<k);
    int cmask = (1<<m);
    
    System.out.println(n|onmask);// or
    System.out.println(n&ofmask);// off
    System.out.println(n^tmask);// toggle
    System.out.println((n&cmask)>0?true:false);// check
    // System.out.println(n|onmask);// or
    
  }

}
