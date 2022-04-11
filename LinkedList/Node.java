          
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
        Node mergeList = new Node();
        while (LinkedList1.hasNext() && LinkedList2.hasNext()) {
            if (LinkedList1.getValue() <= LinkedList2.getValue()) {
                mergeList.next = LinkedList1;
                LinkedList1 = LinkedList1.next;
            }
 
            else {
                mergeList.next = LinkedList2;
                LinkedList2 = LinkedList2.next;
            }
            mergeList = mergeList.next;
        }
        return mergeList.next;
        }
        
     }

