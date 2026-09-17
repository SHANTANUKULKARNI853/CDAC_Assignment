/*
4) Understand Collection Concept using List type 
   a) create object of ArrayList and call add , remove , get methods from array  , and display data of array using for loop and for each loop 
*/
package assignment;

import java.util.ArrayList;

class Q4Test {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Amit");
        names.add("Pratik");
        names.add("Shantanu");

        System.out.println("ArrayList = " + names);

        names.remove("Amit");

        System.out.println("After Remove = " + names);

        System.out.println("Element at index 1 = " + names.get(1));

        System.out.println("\nUsing for loop:");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println("\nUsing for-each loop:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}