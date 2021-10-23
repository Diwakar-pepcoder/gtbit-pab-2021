import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();

    //write your code here
    
    int one=0;
    int two =0;
    boolean remone = true;
    
    for(int i=str.length()-1;i>=0;i--){
        
        if(str.charAt(i) == '1'){
            if(remone){
                one++;
            }else{
                two++;
            }
        }
        remone = !remone;
    }
    
    int diff = Math.abs(one-two);
    
    System.out.println(diff % 3==0);
    
  }

}
