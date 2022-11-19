import java.util.Collections;
import java.util.LinkedList;
public class LinkedListJava {
    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<Integer>();
        a.add(1);  // add element
        a.add(4);
        a.add(8);
        a.add(6);
        a.add(7);
        System.out.println(a);
        a.addFirst(2); // add at first
        System.out.println(a);
        a.addLast(0); // add at last
        System.out.println(a);
        a.remove(0); // remove element at index
        System.out.println(a);
        a.removeFirst(); // remove first element
        System.out.println(a);
        a.removeLast(); // remove last element
        System.out.println(a);
        Collections.sort(a); // sort
        System.out.println(a);

    }
}
