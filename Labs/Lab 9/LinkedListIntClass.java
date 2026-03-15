public abstract class LinkedListIntClass implements LinkedListIntADT {
  public class Node {
    int data;
    Node next;
    
    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }
  
  public Node head;
  public Node tail;
  public int count;
  
  public LinkedListIntClass() {
    head = tail = null;
    count = 0;
  }
  
  public boolean isEmptyList() {
    return head == null;
  }
  
  public void initializeList() {
    head = tail = null;
    count = 0;
  }
  
  public void print() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }
  
  public int length() {
    return count;
  }
  
  public int front() {
    if (head == null){
      System.out.println("List is empty. Returning -1.");
      return -1;
    }
    
    return head.data;
  }
  
  public int back() {
    if (tail == null) {
      System.out.println("List is empty. Returning -1.");
      return -1;
    }
    
    return tail.data;
  }
  
  public boolean search(int searchItem) {
    Node temp = head;
    while (temp != null) {
      if (temp.data == searchItem) return true;
      temp = temp.next;
    }
    return false;
  }
  
  public abstract void insertFirst(int newItem);
  public abstract void insertLast(int newItem);
  public abstract void deleteNode(int deleteItem);
}