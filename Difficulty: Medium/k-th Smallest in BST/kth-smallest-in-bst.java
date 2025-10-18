/*
class Node {
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    public int kthSmallest(Node root, int k) {
        // code here
        List<Integer> list = new ArrayList<>();
        find(root, k,list);
        if(list.size() < k) return -1;
        return list.get(k-1);
    }
    private static void find(Node root, int k, List<Integer> list){
        if(root == null) return;
        
        find(root.left,k,list);
        list.add(root.data);
        find(root.right, k, list);
    }
}