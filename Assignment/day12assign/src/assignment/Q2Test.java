/*use RandomAccessFile  class from java and write data on File 
  and Read the Data From starting of File and display Data 
*/

package assignment;

import java.io.*;

class Q2Test {

    public static void main(String[] args) {

        try {

            RandomAccessFile file =
                    new RandomAccessFile("Data.txt", "rw");

            file.writeUTF("Hello Java");
            file.writeUTF("Random Access File");

            file.seek(0);

            System.out.println(file.readUTF());
            System.out.println(file.readUTF());

            file.close();

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
    }
}
