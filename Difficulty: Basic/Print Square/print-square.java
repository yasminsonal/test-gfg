// User function Template for Java
class Solution {
    public static void square(int s) {
        // Complete the code given below
        for(int i=1;i<=s;i++){
            for(int j=1;j<=s;j++){
                if(j==1 || j==s || i==1 || i==s){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
