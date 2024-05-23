import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Bus> buses= new ArrayList<>();
        int userInput=1;
        while(userInput==1){
            System.out.println("Enter 1 to book and 2 to exit");
            Scanner scanner = new Scanner(System.in);
            userInput=scanner.nextInt();
            if(userInput==1){
                System.out.println("Booking.............");
            }
        }
    }
}