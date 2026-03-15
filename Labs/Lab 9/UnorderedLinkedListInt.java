public class UnorderedLinkedListInt extends LinkedListIntClass {
  
  public void insertFirst(int newItem) {
    Node newNode = new Node(newItem);
    newNode.next = head;
    head = newNode;
    if (tail == null) tail = head;
    count++;
  }
  
  public void insertLast(int newItem) {
    Node newNode = new Node(newItem);
    if (head == null) {
      head = tail = newNode;
    } else {
      tail.next = newNode;
      tail = newNode;
    }
    count++;
  }
  
  public void deleteNode(int deleteItem) {
    if (head == null) return;
    
    if (head.data == deleteItem) {
      head = head.next;
      count--;
      if (head == null) tail = null;
      return;
    }
    
    Node current = head;
    Node prev = null;
    
    while (current != null && current.data != deleteItem) {
      prev = current;
      current = current.next;
    }
    
    if (current != null) {
      prev.next = current.next;
      if (current == tail) tail = prev;
      count--;
    }
  }
  
  public int findSum() {
    int sum = 0;
    Node current = head;
    
    while (current != null) {
      sum += current.data;
      current = current.next;
    }
    
    return sum;
  }
  public int findMin() {
    if (head == null) {
      System.out.println("List is empty. Returning -1.");
      return -1;
    }
    
    int min = head.data;
    Node current = head.next;
    
    while (current != null) {
      if (current.data < min) {
        min = current.data;
      }
      current = current.next;
    }
    
    return min;
  } 
  
  public String toString(){
    Node current = head;
    while (current != null) {
      current.data;
      if (current.next != null) {
        System.out.print(", ");
      }
      current = current.next;
    }
    
    return toString();
  }
  
}