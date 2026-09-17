/*Explore the Enum concept 

Create enum 

Menu with items COFFE , Tea , Maggi , Pizza , Sandwich 

Create another enum Size with items SMALL , MEDIUM , LARGE

Create an menu driven program 

Display Menu Items 

Accept the Menu after that Accept the Size 

Then accept the Quantity 

At the end display Total Bill with each menu item ,  size ,  quantity , total amount*/

package assignment;

import java.util.Scanner;

class Q3Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double totalBill = 0;

        while (true) {

            System.out.println("----- MENU -----");

            Q3Menu[] menu = Q3Menu.values();

            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i] + " - " + menu[i].price);
            }

            System.out.println("6. Exit");

            System.out.println("Enter Menu Choice:");
            int choice = sc.nextInt();

            if (choice == 6) {
                break;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid Choice");
                continue;
            }

            Q3Menu selectedMenu = menu[choice - 1];

            System.out.println("----- SIZE -----");

            Q3Size[] sizes = Q3Size.values();

            for (int i = 0; i < sizes.length; i++) {
                System.out.println((i + 1) + ". " + sizes[i]);
            }

            System.out.println("Enter Size:");
            int sizeChoice = sc.nextInt();

            if (sizeChoice < 1 || sizeChoice > 3) {
                System.out.println("Invalid Size");
                continue;
            }

            Q3Size selectedSize = sizes[sizeChoice - 1];

            System.out.println("Enter Quantity:");
            int quantity = sc.nextInt();

            double amount = selectedMenu.price *
                            selectedSize.multiplier *
                            quantity;

            totalBill = totalBill + amount;

            System.out.println();
            System.out.println("Item = " + selectedMenu);
            System.out.println("Size = " + selectedSize);
            System.out.println("Quantity = " + quantity);
            System.out.println("Amount = " + amount);
            System.out.println();

            System.out.println("Do you want to continue? 1.Yes 2.No");
            int continueChoice = sc.nextInt();

            if (continueChoice == 2) {
                break;
            }
        }

        System.out.println("------------------------");
        System.out.println("Total Bill = " + totalBill);

        sc.close();
    }
}
