import java.util.*;
public class Stack_Client {
  public static void main(String[] args) {
    LinkedStackClass<Integer> stack = new LinkedStackClass<Integer>();
    int[] input = {25, 10, 15, 10, 20, 37, 10, 59, 21, 10, 27, 20, 4, 2, 10, 53, 47, 37, 59, 77, 27, 20, 10};
    for (int num : input) stack.push(num);
    
    System.out.println("The original stack printed in direct order (bottom to top) is:");
    printStack(stack);
    System.out.println("The stack printed in reverse order (top to bottom) is:");
    printBackStack(stack);
    System.out.println("The stack stores " + countItems(stack) + " items.");
    System.out.println("The top is: " + stack.peek());
    System.out.println("The second item (below top) is: " + getSecond(stack));
    
    System.out.println("Removing all occurrences of 10...");
    removeItem(stack, 10);
    printStack(stack);
    
    System.out.println("Reversing the stack using a queue...");
    reverseStack(stack);
    System.out.println("The new stack printed in direct order is:");
    printStack(stack);
    
    System.out.println("Testing queue operations...");
    QueueClass<Integer> queue = new QueueClass<Integer>(10);
    for (int i = 3; i <= 30; i += 3) queue.enqueue(i);
    System.out.println("The queue is:");
    printQueue(queue); 
    reverseQueue(queue);
    System.out.println("\nThe reversed queue is:");
    printQueue(queue);
  }
  
  public static void printBackStack(LinkedStackClass<Integer> stack) {
    LinkedStackClass<Integer> temp = new LinkedStackClass<Integer>();
    ArrayList<Integer> items = new ArrayList<Integer>();

    while (!stack.isEmpty()) {
        int value = stack.pop();
        items.add(value);
        temp.push(value);
    }

    for (int i = items.size() - 1; i >= 0; i--) {
        System.out.print(items.get(i) + " ");
    }
    System.out.println();

    while (!temp.isEmpty()) {
        stack.push(temp.pop());
    }
}
  public static void printStack(LinkedStackClass<Integer> stack) {
    LinkedStackClass<Integer> temp = new LinkedStackClass<Integer>();
    while (!stack.isEmpty()) {
        Integer value = stack.pop();
        System.out.print(value + " ");
        temp.push(value);
    }
    while (!temp.isEmpty()) {
        stack.push(temp.pop());
    }
    System.out.println();
}
  public static Integer getSecond(LinkedStackClass<Integer> stack) {
    if (stack.isEmpty()) 
      return null;

    Integer top = stack.pop();
    Integer second = stack.isEmpty() ? null : stack.peek();
    stack.push(top);

    return second;
}
 public static int countItems(LinkedStackClass<Integer> stack) {
    LinkedStackClass<Integer> temp = new LinkedStackClass<>();
    int count = 0;

    while (!stack.isEmpty()) {
        temp.push(stack.pop());
        count++;
    }

    while (!temp.isEmpty()) {
        stack.push(temp.pop());
    }

    return count;
} 
 public static void removeItem(LinkedStackClass<Integer> stack, int item) {
    LinkedStackClass<Integer> temp = new LinkedStackClass<>();

    while (!stack.isEmpty()) {
        int val = stack.pop();
        if (val != item) temp.push(val);
    }

    while (!temp.isEmpty()) {
        stack.push(temp.pop());
    }
}
 public static void reverseStack(LinkedStackClass<Integer> stack) {
    QueueClass<Integer> queue = new QueueClass<>(100);

    while (!stack.isEmpty()) {
        queue.enqueue(stack.pop());
    }

    while (!queue.isEmpty()) {
        stack.push(queue.dequeue());
    }
}
 public static void reverseQueue(QueueClass<Integer> queue) {
    LinkedStackClass<Integer> stack = new LinkedStackClass<>();

    while (!queue.isEmpty()) {
        stack.push(queue.dequeue());
    }

    while (!stack.isEmpty()) {
        queue.enqueue(stack.pop());
    }
}
 public static void printQueue(QueueClass<Integer> queue) {
    QueueClass<Integer> temp = new QueueClass<>(100);

    while (!queue.isEmpty()) {
        int val = queue.dequeue();
        System.out.print(val + " ");
        temp.enqueue(val);
    }
    System.out.println();

    while (!temp.isEmpty()) {
        queue.enqueue(temp.dequeue());
    }
}
  
}