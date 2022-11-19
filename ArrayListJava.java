// arraylist is class is a resizeable array which can be found in java.util class
// IN normal array we can not add or delete data but in arraylist we can add and remove data

import java.util.ArrayList;
import java.util.*;
public class ArrayListJava {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        a.add(12); // add element
        a.add(13);
        a.add(18);
        a.add(14);
        a.add(18);
        a.add(11);
        a.add(16);
        a.add(10);
        System.out.println(a);

        Collections.sort(a); // sort arraylist
        System.out.println(a);

        System.out.println(a.get(2));  // access elements at index by get

        a.set(1,222);  // replace element at index 1 by 2
        System.out.println(a);

        System.out.println("size: "+a.size());  // to find length/ size of array

        a.remove(5); // remove element at index i
        System.out.println(a);

        a.clear();  // remove or clear all array list.

        System.out.println(a);


    }
}
