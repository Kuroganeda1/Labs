import java.util.ArrayList;
public class Lab8_4 {
public static void main(String[] args) {
ArrayList <Integer> list = new ArrayList <Integer>();
list.add(2);
list.add(2);
list.add(2);
list.add(5);
list.add(5);
list.add(8);
list.add(9);
list.add(9);
System.out.println("The original list is: ");
print(list);
System.out.println("The list after method call is: ");
removeDuplicates(list);
print(list);
}
public static void removeDuplicates(ArrayList<Integer> list) {
if (list.size() == 0) return;
    ArrayList<Integer> result = new ArrayList<Integer>();
    result.add(list.get(0));

    for (int i = 1; i < list.size(); i++) {
        if (!list.get(i).equals(list.get(i - 1))) {
            result.add(list.get(i));
        }
    }

    list.clear();
    list.addAll(result);

}
public static void print(ArrayList <Integer> someList) {
for(Integer i:someList)
System.out.print(i + " ");
System.out.println();
}
}