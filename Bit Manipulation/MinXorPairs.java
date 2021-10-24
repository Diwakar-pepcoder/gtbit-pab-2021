import java.io.*;
import java.util.*;

public class Main {

    public static void solution(int[] arr) {
        
        Arrays.sort(arr);
        int n = arr.length;
        
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length-1;i++){
            min = Math.min(min, arr[i]^arr[i+1]);
        }
        
        for(int i=0;i<arr.length-1;i++){
            if((arr[i]^arr[i+1]) == min){
                System.out.println(arr[i]+", "+arr[i+1]);
            }
        }
        
        
        
    }
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = scn.nextInt();
        }
        solution(arr);
    }
    
    
}
