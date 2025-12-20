class Solution {
    public static int nSum(int n) {
        // code here
      
        int sum=0;
        
              while(n>0){
                sum += n;
                n--;
            
        }
        return sum;
    }
}
