// hash map stores data in the form of key and value pair like python dictionary
import java.util.HashMap;

public class HashMapJava {
    public static void main(String[] args) {
        HashMap<Integer,String> a = new HashMap<Integer,String>();
        a.put(0,"a");  // add data in hashmap
        a.put(1,"b");
        a.put(2,"c");
        a.put(3,"d");
        a.put(4,"e");
        System.out.println(a);
        System.out.println(a.get(0)); // access value by key
        a.remove(0); // remove element by using key
        System.out.println(a);
        System.out.println(a.size()); // size
        // loop through hashmap
        for ( Integer i : a.keySet()){  // .keySet is for return keys
            System.out.println(i);
        }
        for (String i :a.values()) { // .values return values
            System.out.println(i);
        }
        for (Integer i: a.keySet()){
            System.out.println(i+":"+a.get(i));
        }
        a.clear(); // clear all hashmap
        System.out.println(a);
    }
}
