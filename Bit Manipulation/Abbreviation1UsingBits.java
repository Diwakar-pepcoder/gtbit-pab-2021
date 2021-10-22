import java.io.*;
import java.util.*;

public class Main {

    public static void solve(String str){
        
        int n = str.length();
        
        int tpn = 1<<(n); // 2 ^ n
        
        for(int val=0;val<tpn;val++){
            
            StringBuilder sb = new StringBuilder();
                int count=0;
            for(int j=0;j<n;j++){
                char ch = str.charAt(j);
                
                int b = n-1-j;
                int mask = 1<<b;
                
                if((val & mask) == 0){
                    if(count > 0){
                        sb.append(count);
                        count=0;
                    }
                    sb.append(ch);
                }else{
                    count++;
                }
                
            }
            if(count > 0){
                sb.append(count);
            }
            System.out.println(sb);
        }
        
    }
    
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        solve(str);
    }
}
