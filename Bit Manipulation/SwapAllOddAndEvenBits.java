import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    //write your code here
    
    int om = 0xAAAAAAAA;// 1010 1010 1010 ......
    int em = 0x55555555;// 0101 0101 0101 .....
    
    int odds = n&om;
    int evens = n&em;
    
    odds = odds >> 1;
    evens = evens <<1;
    
    int ans = odds|evens;
    
    System.out.println(ans);
    
  }

}
