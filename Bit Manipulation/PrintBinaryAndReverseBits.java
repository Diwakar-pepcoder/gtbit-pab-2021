import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    //write your code here
    
    boolean flag = false;
    int bi=0;
    int rev = 0;
    
    for(int i=31;i>=0;i--){
        int mask = 1<<i;
        
        if((n&mask) > 0)flag = true;
        
        if(flag == false)continue;
        
        if((n&mask) == 0){
            System.out.print(0);
        }else{
            System.out.print(1);
            int bmask = 1<<bi;
            rev |= bmask;
        }
        bi++;
    }
    
    System.out.println();
    System.out.println(rev);
  }

}
