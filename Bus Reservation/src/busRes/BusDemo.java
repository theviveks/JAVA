package busRes;

import java.util.*;

public class BusDemo {
    public static void main(String[] args) {
        ArrayList<Bus> buses= new ArrayList<>();
        ArrayList<Booking> bookings= new ArrayList<>();
        buses.add(new Bus(20,true,2));
        buses.add(new Bus(30,false,2));
        buses.add(new Bus(26,true,22));
        for(Bus b:buses){
            b.displayBus();
        }
        int userInput=1;
        Scanner scanner = new Scanner(System.in);
        while(userInput==1){
            System.out.println("Enter 1 to book and 2 to exit");
            userInput=scanner.nextInt();
            if(userInput==1){
                Booking booking = new Booking();
                if(booking.isAvailable(buses,bookings)){
                    bookings.add(booking);
                    System.out.println("Booking is confirmed");
                }
                else{
                    System.out.println("Sorry,Bus is full , try different date or Bus");
                }
            }
        }
        scanner.close();
    }
}