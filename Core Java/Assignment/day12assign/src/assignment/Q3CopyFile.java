package assignment;

import java.io.*;

class Q3CopyFile {

    public static void main(String[] args) {

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {

            fis = new FileInputStream("Source.txt");
            fos = new FileOutputStream("Destination.txt");

            int data;

            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully");

        } catch (IOException e) {

            System.out.println(e.getMessage());

        } finally {

            try {

                if (fis != null) {
                    fis.close();
                }

                if (fos != null) {
                    fos.close();
                }

                System.out.println("Resources closed");

            } catch (IOException e) {

                System.out.println(e.getMessage());
            }
        }
    }
}
