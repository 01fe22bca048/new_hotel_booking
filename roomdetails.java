package hotel_booking.new_hotel_booking;

public class roomdetails {
    int room_no;
    public void print()
    {
       if(room_no==101)
       {
        System.out.println("Your room is in first floor");
       }

       else if(room_no==102)
       {
        System.out.println("Your room is in second floor");
       }

       else
       {
        System.out.println("Your room is in Third floor");
       }
    }
}