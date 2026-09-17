//2) Try Vector and LinkedList classes with String Data

package assignment;

import java.util.Vector;
import java.util.LinkedList;

class Q2Test {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        v.add("Java");
        v.add("Python");
        v.add("C++");
        v.add("HTML");

        System.out.println("Vector:");
        
        for (String s : v) {
            System.out.println(s);
        }

        System.out.println("Element at index 1 = " + v.get(1));

        v.remove("Python");

        System.out.println("Vector after remove:");

        for (String s : v) {
            System.out.println(s);
        }

        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("HTML");

        System.out.println("\nLinkedList:");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("Element at index 1 = " + list.get(1));

        list.remove("Python");

        System.out.println("LinkedList after remove:");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
