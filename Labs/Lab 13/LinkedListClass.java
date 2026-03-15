import java.util.*;

public abstract class LinkedListClass<T> implements LinkedListADT<T> {
  Node<T> head;
  Node<T> last;
  int size;

  public LinkedListClass() {
    head = null;
    last = null;
    size = 0;
  }

  public boolean isEmptyList() {
    return head == null;
  }

  public void initializeList() {
    head = null;
    last = null;
    size = 0;
  }

  public int length() {
    return size;
  }

  public T front() {
    if (isEmptyList()) throw new NoSuchElementException("List is empty");
    return head.info;
  }

  public T back() {
    if (isEmptyList()) throw new NoSuchElementException("List is empty");
    return last.info;
  }

  public void print() {
    Node<T> current = head;
    while (current != null) {
      System.out.print(current.info + " --> ");
      current = current.link;
    }
    System.out.println("null");
  }

  public boolean search(T iSearchItem) {
    Node<T> current = head;
    while (current != null) {
      if (current.info.equals(iSearchItem)) return true;
      current = current.link;
    }
    return false;
  }

  public static class Node<T> {
    T info;
    Node<T> link;

    public Node(T iInfo, Node<T> iLink) {
      info = iInfo;
      link = iLink;
    }
  }
}