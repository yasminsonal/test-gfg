class Solution {
    public static void utility(int n) {

        // just complete below statement
        int ans;
        if(n > 0){
            ans = n% 10;
        }
        else{
            ans = (-1) * (n%10);
        }

    
  

            // below statement print the result
            System.out.println(ans);
    }
}