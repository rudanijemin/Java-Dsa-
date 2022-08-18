/*size of binary tree => number of nodes */
public class size {
    int size(Node root){
        if(root==null) return 0;
        return size(root.left) +size(root.right)+1;
    } 
    public static void main(String[] args) {
        size s = new size();
        s.size(root);
    } 
}
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
    }
} 
