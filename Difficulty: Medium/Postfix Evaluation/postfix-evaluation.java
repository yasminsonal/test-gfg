class Solution {
    public int evaluatePostfix(String[] arr) {
        // code here
        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        int ans = 0;
     
        for(int i = 0; i < n; i++){
            int a = 0, b = 0;
            if(arr[i].equals("+")){
                if(!s.isEmpty()) b = s.pop();
                if(!s.isEmpty()) a = s.pop();
                
                ans = a+b;
                s.push(ans);
            }
            else if(arr[i].equals("-")){
                if(!s.isEmpty()) b = s.pop();
                if(!s.isEmpty()) a = s.pop();
                
                ans = a-b;
                s.push(ans);
            }
            else if(arr[i].equals("*")){
                if(!s.isEmpty()) b = s.pop();
                if(!s.isEmpty()) a = s.pop();
                
                ans = a*b;
                s.push(ans);
            }
            else if(arr[i].equals("/")){
                if(!s.isEmpty()) b = s.pop();
                if(!s.isEmpty()) a = s.pop();
                
                ans = a/b;
                if((a*b) < 0 && a%b != 0) ans--;
                s.push(ans);
            }
            else if(arr[i].equals("^")){
                if(!s.isEmpty()) b = s.pop();
                if(!s.isEmpty()) a = s.pop();
                
                ans = (int)Math.pow(a,b);
                s.push(ans);
            }
            else{
                int c = Integer.parseInt(arr[i]);
                s.push(c);
            }
        }
        
        return ans;
    }
}