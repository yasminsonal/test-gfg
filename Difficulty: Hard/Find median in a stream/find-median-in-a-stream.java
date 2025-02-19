//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] parts = s.split(" ");
            int[] nums = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                nums[i] = Integer.parseInt(parts[i]);
            }
            Solution ob = new Solution();
            ArrayList<Double> ans = ob.getMedian(nums);
            for (double i : ans) {
                System.out.printf("%.1f ", i);
            }
            System.out.println();
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    public ArrayList<Double> getMedian(int[] arr) {
        // code here
        ArrayList<Double> ans=new ArrayList<>();
        ArrayList<Integer> sorted=new ArrayList<>();
        boolean isOdd=true;
        for(int num:arr){
            add(sorted,num);
            int mid=sorted.size()/2;
            if(isOdd){
                ans.add((double)sorted.get(mid));
            }else{
                double m1=(double)sorted.get(mid);
                double m2=(double)sorted.get(mid-1);
                ans.add((m1+m2)/2d);
            }
            isOdd=!isOdd;
        }
        return ans;
    }
    
    void add(ArrayList<Integer> list,int num){
        if(list.size()==0 || list.get(list.size()-1)<=num){
            list.add(num);
            return;
        }
        
        if(list.get(0)>num) list.add(0,num);
        else{
            int high=list.size()-1;
            int low=0;
            int pos=-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(list.get(mid)<=num){
                    low=mid+1;
                }else{
                    pos=mid;
                    high=mid-1;
                }
            }
            list.add(pos,num);
        }
    }
}