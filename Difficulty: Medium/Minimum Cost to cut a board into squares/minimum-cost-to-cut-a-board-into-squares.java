class Solution {
    public static int minCost(int n, int m, int[] x, int[] y) {
        // code here
         int h = 1;
        int v = 1;
        Arrays.sort(x);
        Arrays.sort(y);
        int cost = 0;
        
        int j = n-2;
        int i = m-2;
        
        while(i >= 0 && j >= 0){
            if(x[i] > y[j]){
                cost += (x[i]*h);
                v++;
                i--;
            }
            else{
                cost += (y[j]*v);
                h++;
                j--;
            }
        }
        
        while(i >= 0){
            cost += (x[i]*h);
            i--;
        }
        
        while(j >= 0){
            cost += (y[j]*v);
            j--;
        }
        
        return cost;
    }
}
