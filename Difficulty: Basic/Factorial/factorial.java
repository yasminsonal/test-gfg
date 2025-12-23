class Solution {
    public int factorial(int n) {
   
        int fact=1;
       while(n>1){
            fact *=n;
            n=n-1;;
        }
        return fact;
    }
}
