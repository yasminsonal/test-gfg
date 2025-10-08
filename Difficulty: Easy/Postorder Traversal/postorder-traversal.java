/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> post=new ArrayList<>();
        Stack<Node> stack=new Stack<>();
        Node curr=root;
        while(curr!=null || !stack.isEmpty()){
            if(curr!=null){
                stack.push(curr);
                curr=curr.left;
            }
            else{
                Node temp=stack.peek().right;
                if(temp==null){
                    temp=stack.pop();
                    post.add(temp.data);
                    while(!stack.isEmpty() && temp==stack.peek().right){
                        temp=stack.pop();
                        post.add(temp.data);
                    }
                }
                else curr=temp;
            }
        }
        return post;
    }
}