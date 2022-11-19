// hashset is used for store unique values.

import java.util.HashSet;
public class HashSetJava {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<Integer>();
        a.add(0);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        System.out.println(a.contains(4)); // check whether data is present in set or not.
        a.remove(4); // remove
        System.out.println(a.size()); // size
        for (int i: a){
            System.out.println(i);
        }
        a.clear(); // clear
    }
}
