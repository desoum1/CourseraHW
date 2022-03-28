public class BinaryTree {
    Node root;

    // print tree in pretty way in terminal
    public void prettyPrint(Node node, int indent) {
      if (node == null)              
        return;
      prettyPrint(node.right, indent + 4);
      for (int i = 0; i < indent; i++)
        System.out.print(" ");
      System.out.println(node.key);
      prettyPrint(node.left, indent + 4);
    }


    public void inOrder(Node node){
        /*if (node.left == null)
            return;
        Node e= node.left;
 
        System.out.println(node.left.key);
     
        inOrder(e);*/
        
        
        if (node == null)
        return;
        System.out.print(" " + node.key);
        inOrder(node.left);
        inOrder(node.right);
  }
    }
    
    /*public static void main(String[] args) {
  
      // create an object of BinaryTree
      BinaryTree tree = new BinaryTree();

        tree.root = new Node(2);
        tree.root.left = new Node(1);
        tree.root.right = new Node(3);

        
      tree.prettyPrint(tree.root, 0);
      
      
      
      {
            
            Node e= node.right;
 
            System.out.println(e.right.key);
     
            inOrder(e);
        }
    }*/
    
    

