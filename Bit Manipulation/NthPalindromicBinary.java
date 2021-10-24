import java.io.*;
import java.util.*;

public class Main {

    
    static int reverse(int n){
        
        boolean flag = false;
        int bi=0;
        int rev = 0;
        
        for(int i=31;i>=0;i--){
            int mask = 1<<i;
            
            if((n&mask) > 0)flag = true;
            
            if(flag == false)continue;
            
            if((n&mask) == 0){
                // System.out.print(0);
            }else{
                // System.out.print(1);
                int bmask = 1<<bi;
                rev |= bmask;
            }
            bi++;
        }
        
        return rev;
    }

    static int countFor(int len){
        int change = (len-1)/2;
        return 1<<change;
    }
    public static int NthPalindromicBinary(int n) {
            
        int len = 1;
        int total = 1;
        
        while(total + countFor(len+1) < n){
            total += countFor(len+1);
            len++;
        }
        
        len++;// 7
        int offset = n-total-1;// 1 offset yyyy 1
        int ans = (1<<(len-1));// 1000000
        ans = ans | (offset<<(len/2));// 1 offset 000000
        
        int rev = reverse(ans);
        
        return ans | rev;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(NthPalindromicBinary(n));
    }

}
