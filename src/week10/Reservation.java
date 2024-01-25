package week10;

import javax.swing.text.html.StyleSheet;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Reservation {

    public static void main(String[] args) {


        Scanner input  = new Scanner(System.in);
        System.out.println("Hello, would you like to make reservation at our Java restaurant\nPlease enter the year");

        int year = input.nextInt();
        System.out.println("Please enter the month");
        int month = input.nextInt();
        System.out.println("Please enter the date");
        int date = input.nextInt();
        System.out.println("Please enter the time (24h format)");
        int hour = input.nextInt();

        LocalDateTime dateTime = LocalDateTime.of( year, month, date, hour, 0);
        System.out.println(dateTime);

        if (dateTime.getYear() != 2023){
            System.err.println("Sorry we cannot make a reservation for the year: "+ year);
            System.exit(0);
        }

        if ( dateTime.isAfter(LocalDateTime.now())){
            System.err.println("Sorry this date has already passed");
            System.exit(0);
        }

        if ( dateTime.getMonthValue() == 11 && dateTime.getDayOfMonth() == 23 ||
                (dateTime.getMonthValue() == 12 && dateTime.getDayOfMonth() == 24)){
            System.err.println("Sorry we are booked on that day");
            System.exit(0);
        }


    }
}
