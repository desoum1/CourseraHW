
/**
 * Write a description of Node here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Node {
    private int value;
    private Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }

    Node() {
        this.value = 0;
        this.next = null;
    }

    public int getValue() {
        return value;
    }
    
      public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public boolean hasNext() {
        return (next != null);
    }
    
    public Node mergeList(Node LinkedList1, Node LinkedList2){
        Node mergeList = new Node(null);
        if (linkedList2.getvalue()>LinkedList2.getvalue(){
        }
     }
}
