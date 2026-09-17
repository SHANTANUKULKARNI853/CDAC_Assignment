package assignment;

import java.io.*;
import java.util.Scanner;

class Q3FileDemo {

    static void simpleFileDemo() throws IOException {

        FileOutputStream fos = new FileOutputStream("Data.txt");

        String data = "Hello Java File Handling";

        fos.write(data.getBytes());

        fos.close();

        FileInputStream fis = new FileInputStream("Data.txt");

        int ch;

        while ((ch = fis.read()) != -1) {
            System.out.print((char) ch);
        }

        fis.close();
    }

    static void bufferedFileDemo() throws IOException {

        BufferedOutputStream bos =
                new BufferedOutputStream(new FileOutputStream("Data.txt"));

        String data = "Hello Buffered File Handling";

        bos.write(data.getBytes());

        bos.close();

        BufferedInputStream bis =
                new BufferedInputStream(new FileInputStream("Data.txt"));

        int ch;

        while ((ch = bis.read()) != -1) {
            System.out.print((char) ch);
        }

        bis.close();
        
    }
    static void acceptSentence() throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sentence:");
        String data = sc.nextLine();

        FileOutputStream fos = new FileOutputStream("Data.txt");

        fos.write(data.getBytes());

        fos.close();

        FileInputStream fis = new FileInputStream("Data.txt");

        int ch;

        System.out.println("Data from file:");

        while ((ch = fis.read()) != -1) {
            System.out.print((char) ch);
        }

        fis.close();
    }
}
