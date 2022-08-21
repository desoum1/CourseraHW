public class main {
     public static void main(String[] args){ 
        //print hi
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(2);
        tree.root.left = new Node(1);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.prettyPrint(tree.root, 0);
        System.out.println("");
        //tree.inOrder (tree.root);
        System.out.println("");
        tree.preOrder (tree.root);
        System.out.println("");
        //tree.postOrder (tree.root);
    }
}   