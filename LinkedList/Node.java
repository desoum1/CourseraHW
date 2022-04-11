          
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
    
    public void printList() {
        Node temp = this;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
    
    
        Node LinkedList1 = new Node(1);
        Node head1 = LinkedList1;
        LinkedList1.setNext(new Node(3));
        LinkedList1= LinkedList1.getNext();
        LinkedList1.setNext(new Node(5));
        LinkedList1= LinkedList1.getNext();
        LinkedList1.setNext(new Node(7));
        LinkedList1= LinkedList1.getNext();
        LinkedList1.setNext(new Node(9));
        
        
        Node LinkedList2 = new Node(2);
        Node head2 = LinkedList2;
        LinkedList2.setNext(new Node(2));
        LinkedList2= LinkedList2.getNext();
        LinkedList2.setNext(new Node(4));
        LinkedList2= LinkedList2.getNext();
        LinkedList2.setNext(new Node(6));
        LinkedList2= LinkedList2.getNext();
        LinkedList2.setNext(new Node(8));
        LinkedList1= LinkedList1.getNext();
        LinkedList1.setNext(new Node(10));
        
        System.out.println("");
        head1.printList();
        System.out.println("");
        head2.printList();
        System.out.println("");
        Node mergedlist = mergeList(head1,head2);
        mergedlist.printList();
    }
    public static Node mergeList(Node LinkedList1, Node LinkedList2){
        Node mergeList = new Node();
        Node mergehead = mergeList;
        while (LinkedList1.hasNext() && LinkedList2.hasNext()) {
            
            if (LinkedList1.getValue() <= LinkedList2.getValue()) {
                mergeList.next = LinkedList1;
                
                LinkedList1 = LinkedList1.getNext();
                LinkedList1.printList();
            }
 
            else {
                mergeList.next = LinkedList2;           
                
                LinkedList2 = LinkedList2.getNext();
                LinkedList2.printList();
            }
            mergeList = mergeList.next;
        }
        boolean a;
        if(LinkedList1 == null){
             a = true;
        }else{
             a = false;
        }
        if(a == true){
            mergeList.next = LinkedList2;
        }
        else if(a == false){
            mergeList.next = LinkedList1;
        }
        return mergehead.next;
        }
      
     }

