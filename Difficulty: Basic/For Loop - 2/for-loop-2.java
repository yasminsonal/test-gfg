class Solution {
    public static void utility(String s) {
        // code here
       StringBuilder str=new StringBuilder();
       int i=0;
       while(i < s.length()){
           str.append(s.charAt(i));
           i += 2;
       }
       System.out.print(str);
    }
}