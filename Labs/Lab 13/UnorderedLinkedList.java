public class UnorderedLinkedList extends LinkedListClass<Integer> {

  public boolean linearSearch(int iSearchItem) {
    Node<Integer> current = head;
    while (current != null) {
      if (current.info == iSearchItem) return true;
      current = current.link;
    }
    return false;
  }

  public void bubbleSort() {
    if (head == null) return;

    boolean swapped;
    do {
      swapped = false;
      Node<Integer> current = head;

      while (current.link != null) {
        if (current.info > current.link.info) {
          int temp = current.info;
          current.info = current.link.info;
          current.link.info = temp;
          swapped = true;
        }
        current = current.link;
      }
    } while (swapped);
  }

  public void selectionSort() {
    Node<Integer> start = head;
    while (start != null) {
      Node<Integer> min = start;
      Node<Integer> current = start.link;

      while (current != null) {
        if (current.info < min.info) min = current;
        current = current.link;
      }

      if (min != start) {
        int temp = start.info;
        start.info = min.info;
        min.info = temp;
      }
      start = start.link;
    }
  }

  public boolean binarySearch(int iSearchItem) {
    if (head == null) return false;

    Node<Integer> start = head;
    Node<Integer> end = null;

    while (start != end) {
      Node<Integer> mid = getMiddleNode(start, end);
      if (mid == null) return false;

      if (mid.info == iSearchItem) return true;
      else if (mid.info < iSearchItem) start = mid.link;
      else end = mid;
    }
    return false;
  }

  private Node<Integer> getMiddleNode(Node<Integer> iStart, Node<Integer> iEnd) {
    if (iStart == null) return null;

    Node<Integer> slow = iStart;
    Node<Integer> fast = iStart.link;

    while (fast != iEnd) {
      fast = fast.link;
      if (fast != iEnd) {
        slow = slow.link;
        fast = fast.link;
      }
    }
    return slow;
  }
}