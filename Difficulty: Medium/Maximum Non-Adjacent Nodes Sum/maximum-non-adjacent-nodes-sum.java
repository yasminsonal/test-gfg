/*
class Node {
    int data;
    Node left, right;

    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    class Info{
        int take, noTake, max;
        Info(int take, int noTake){
            this.take = take;
            this.noTake = noTake;
            max = Math.max(take,noTake);
        }
    }
    public int getMaxSum(Node root) {
        // code here
        return find(root).max;
    }
    private Info find(Node root){
        if(root == null) return new Info(0,0);
        
        Info left = find(root.left);
        Info right = find(root.right);
        
        return new Info(left.noTake+right.noTake+root.data,left.max+right.max);
    }
}