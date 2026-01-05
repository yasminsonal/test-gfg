// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        StringBuilder sb=new StringBuilder();
        int n=s.length() - 1;
        for(int i=n;i>=0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
    }
}