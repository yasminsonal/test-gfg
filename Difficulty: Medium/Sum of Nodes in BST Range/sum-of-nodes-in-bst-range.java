/*
class Node {
    int data;
    Node left, right;
    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int nodeSum(Node root, int l, int r) {
        // code here
        if(root == null) return 0;
        int right = nodeSum(root.left,l,r);
        int left = nodeSum(root.right, l, r);
        
        int sum=left+right;
        if(root.data < l || root.data > r) return sum;
        return sum + root.data;
    }
}
