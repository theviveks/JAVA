package busRes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
    String name;
    int busNo;
    Date date;
    Booking(){
        System.out.println("Enter the passenger name ");
        Scanner scanner = new Scanner(System.in);
        String name= scanner.next();
        System.out.println("Enter the Bus No ");
        busNo = scanner.nextInt();
        System.out.println("Enter the date dd-mm-yyyy ");
        String dateInput= scanner.next();
        SimpleDateFormat formatDate=new SimpleDateFormat("dd-MM-yyyy");
        try {
            date=formatDate.parse(dateInput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean isAvailable(ArrayList<Bus> buses,ArrayList<Booking>bookings){
           int capacity=0;
           for(Bus b:buses){
               if(b.getBusno()==busNo){
                   capacity= b.getCapacity();
               }
           }
           int count=0;
           for(Booking b:bookings){
               if(b.busNo==busNo && b.date.equals(date)){
                   count++;
               }
           }
        return count<capacity?true:false;
    }

}
