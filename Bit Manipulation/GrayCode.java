import java.util.*;
 
 public class Main {
 
     public static List<Integer> grayCode(int n) {
 	    List<Integer> ans = new ArrayList<>();
 	    if(n == 0){
 	        ans.add(0);
 	        return ans;
 	    }
 	    
 	    List<Integer> fans = grayCode(n-1);
 	    
 	    
 	    for(int v: fans){
 	        ans.add(v);
 	    }
 	    
 	    int mask = 1<<(n-1);
 	    for(int i=fans.size()-1;i>=0;i--){
 	        int v = fans.get(i);
 	        
 	        ans.add(v|mask);
 	    }
 	    
 	    return ans;
     }
 
     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         List<Integer> ans=grayCode(scn.nextInt());
         Collections.sort(ans);
         System.out.println(ans);
     }
 }
