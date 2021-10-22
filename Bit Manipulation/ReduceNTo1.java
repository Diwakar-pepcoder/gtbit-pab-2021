import java.io.*;
import java.util.*;

public class Main {

    public static int solution(int n) {
        
        long x = n;
        int ans=0;
        
        while(x != 1){
            
            if(x %2==0){
                x = x/2;
            }else if((x&0b111) == 0b111){
                x = x+1;
            }else{
                x = x-1;
            }
            ans++;
        }
        
        return ans;
    }
    
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
        System.out.println(solution(n));
    }
	
	
}
