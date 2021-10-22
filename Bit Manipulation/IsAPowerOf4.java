class Solution {
    public boolean isPowerOfFour(int n) {
        
        int val = (01010101);// decimal
        
        int mask = 0b01010101010101010101010101010101;
        System.out.println(mask);
        return n>0 && (n&(n-1))==0 && (n&mask)>0;
        
    }
}
