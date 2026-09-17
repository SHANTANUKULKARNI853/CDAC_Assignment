/*1) Write a Menu Driven java program to store List of Commonly found trees  
in each city. 
The List should be sorted on city names 
Accept name of city and list of tree names from user. And perform following: 
1. Find list of trees for a city 
2. Delete List of a particular city 
3. Add new entry in treemap 
Check whether city name already exists 
4. Display all city names and List of trees (Use Iterator and foreach)*/

package assignment;

import java.util.*;

class Q1Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeMap<String, ArrayList<String>> treeMap = new TreeMap<>();

        while (true) {

            System.out.println("\n1. Find Trees By City");
            System.out.println("2. Delete City");
            System.out.println("3. Add New City");
            System.out.println("4. Display All");
            System.out.println("5. Exit");

            System.out.println("Enter Choice:");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.println("Enter City Name:");
                    String searchCity = sc.nextLine();

                    if (treeMap.containsKey(searchCity)) {

                        System.out.println(
                                "Trees = " + treeMap.get(searchCity));

                    } else {

                        System.out.println("City Not Found");
                    }

                    break;

                case 2:

                    System.out.println("Enter City Name:");
                    String deleteCity = sc.nextLine();

                    if (treeMap.containsKey(deleteCity)) {

                        treeMap.remove(deleteCity);

                        System.out.println("City Deleted");

                    } else {

                        System.out.println("City Not Found");
                    }

                    break;

                case 3:

                    System.out.println("Enter City Name:");
                    String city = sc.nextLine();

                    if (treeMap.containsKey(city)) {

                        System.out.println("City Already Exists");

                    } else {

                        System.out.println(
                                "Enter Number of Trees:");

                        int n = sc.nextInt();
                        sc.nextLine();

                        ArrayList<String> trees =
                                new ArrayList<>();

                        for (int i = 0; i < n; i++) {

                            System.out.println(
                                    "Enter Tree Name:");

                            String tree = sc.nextLine();

                            trees.add(tree);
                        }

                        treeMap.put(city, trees);

                        System.out.println("City Added");
                    }

                    break;

                case 4:

                    System.out.println("\nUsing Iterator:");

                    Iterator<Map.Entry<String, ArrayList<String>>>
                            itr = treeMap.entrySet().iterator();

                    while (itr.hasNext()) {

                        Map.Entry<String, ArrayList<String>> entry =
                                itr.next();

                        System.out.println(
                                entry.getKey() + " = "
                                + entry.getValue());
                    }

                    System.out.println("\nUsing For-Each:");

                    for (Map.Entry<String, ArrayList<String>> entry
                            : treeMap.entrySet()) {

                        System.out.println(
                                entry.getKey() + " = "
                                + entry.getValue());
                    }

                    break;

                case 5:

                    System.out.println("Program Ended");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}
