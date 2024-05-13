package hotel_booking;

public class hoteldetails {

    public static void main(String args[]) {
        customer_details c1 = new customer_details("John Doe", "2024-05-14", 101);
        c1.print_details();

        roomdetails r1 = new roomdetails(c1.room_no);
        r1.print();
    }

    static class customer_details {
        String name;
        String booking;
        int room_no;

        // Constructor with parameters for compile-time input
        public customer_details(String name, String booking, int room_no) {
            this.name = name;
            this.booking = booking;
            this.room_no = room_no;
        }

        public void print_details() {
            System.out.println("Entered Customer Name is : " + name);
            System.out.println("Entered Customer Date of booking  is : " + booking);
            System.out.println("Entered Customer Room number is : " + room_no);
        }
    }
}
