import java.util.Scanner;

/*inorder,preorder,postorder */
class btree{
    Node root;
    Scanner sc;
    btree(){
        sc = new Scanner(System.in);
    }
    //create a binary tree and return the root node
    Node createBinaryTree(){
        System.out.println("enter data");
        int data = sc.nextInt();

        if(data==-1)return null;

        Node node = new Node(data);

        System.out.println("enter "+data+"'s left data");
        node.left=createBinaryTree();

        System.out.println("enter "+data+"'s right data");
        node.right=createBinaryTree();

        return node;
    }
    void inorder(Node root){
        if(root == null){
            return;
        } 
        System.out.println("inorder");
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    void preorder(Node root){
        if(root == null){
            return;
        } 
        System.out.println("preorder");
        System.out.println(root.data);
        inorder(root.left);
        inorder(root.right);
    }
    void postorder(Node root){
        if(root == null){
            return;
        } 
        System.out.println("postorder");
        inorder(root.left);
        inorder(root.right);
        System.out.println(root.data);

    }
    //height of binary tree
    int height(Node root){
        if(root==null) return 0;
        int lh=height(root.left);
        int rh=height(root.right);

        return Math.max(lh, rh)+1;
    }
    //print all the nodes present at a distance k from root
    void printKdis(Node root,int k){
        if(root==null) return;
        if(k==0){
            System.out.println(root.data);
            return;
        }
        printKdis(root.left, k-1);
        printKdis(root.right, k-1);
    }
    //size of binary tree =>number nodes
    int size(Node root){
        if(root==null) return 0;
        return size(root.left) +size(root.right)+1;
    }
    //find max element
    int maximum(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
    }

    public static void main(String[] args) {
        btree b = new btree();
        Node root=b.createBinaryTree();
        
        //b.inorder(root);
        //b.preorder(root);
        //b.postorder(root);
        b.size(root);
        b.height(root);
        b.printKdis(root, 1);
        b.maximum(root);
    
    }



    


}
class Node{
    int  data;
    Node left,right;
    Node(int data){
        this.data=data;
    }
}
