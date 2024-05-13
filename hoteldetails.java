package hotel_booking;

import java.util.*;

public class hoteldetails {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        customer_details c1 = new customer_details();
        c1.print_details(sc);

        roomdetails r1 = new roomdetails();
        r1.print();
    }

    static class customer_details {
        String name;
        String booking;
        int room_no;

        public void print_details(Scanner sc) {

            System.out.println("Enter customer name");
            name = sc.next();

            System.out.println("Enter date of booking");
            booking = sc.next();

            System.out.println("Enter Room number");
            room_no = sc.nextInt();

            System.out.println("Entered Customer Name is : " + name);
            System.out.println("Entered Customer Date of booking  is : " + booking);
            System.out.println("Entered Customer Room number is : " + room_no);

        }
    }

    
    
}