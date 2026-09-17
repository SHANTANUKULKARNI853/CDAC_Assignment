//use Date and SimpleDateFormat class 
  //and convert date in properfomat
package Assignment;

import java.util.Date;
import java.text.SimpleDateFormat;

class Q3DateFormat {

    public static void main(String[] args) {

        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        String formattedDate = sdf.format(date);

        System.out.println("Current Date = " + formattedDate);
    }
}
