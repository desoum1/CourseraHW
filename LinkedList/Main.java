class Main {
  public static void main(String[] args) {
    Node linkedList = new Node(7);
    Node head = linkedList;         
    linkedList.setNext( new Node(14) );
    linkedList = linkedList.getNext();
    linkedList.setNext( new Node(21) );
    linkedList = linkedList.getNext();
    linkedList.setNext( new Node(28) );
    linkedList = linkedList.getNext();
    linkedList.setNext( new Node(35) );
    linkedList = linkedList.getNext();
    linkedList.setNext( new Node(42) );
    // Print the list
    linkedList = head;
    while (linkedList.hasNext()) {
      System.out.println(linkedList.getValue());
      linkedList = linkedList.getNext();
    }
  }
}
