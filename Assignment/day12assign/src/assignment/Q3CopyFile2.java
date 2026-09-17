/*
3) Write a program to copyFile and at the end of Program make sure you are call close() method to close the resource 

     a) Close in finally
     b) Close with try with Resource*/

package assignment;

import java.io.*;

class Q3CopyFile2 {

    public static void main(String[] args) {

        try (
            FileInputStream fis = new FileInputStream("Source.txt");
            FileOutputStream fos = new FileOutputStream("Destination.txt")
        ) {

            int data;

            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully");

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
    }
}
