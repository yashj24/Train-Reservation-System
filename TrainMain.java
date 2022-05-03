package railwayreservation;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class TrainMain {

    public static void main(String[] args) throws Exception{
        if(Login.UserLogin()){
             System.out.println("Now Searching for trains...");
        TrainService.searchTrainsBetweenStation("Hyderabad", "Bangalore", LocalDate.now(), 10);
        BankAccount b1 = new BankAccount();
        b1.setActNumber(999);
        b1.setActBalance(10000);

        Passenger p1 = new Passenger(10, "Yash", 30, b1);
        Passenger p2 = new Passenger(20, "Divyansh", 30, b1);
        Passenger p3 = new Passenger(10, "Akshat", 35, b1);
        List<Passenger> passengerList = new LinkedList<>();
        passengerList.add(p1);
        passengerList.add(p2);
        passengerList.add(p3);
        int initialBalance=b1.getActBalance();

        TrainService.bookTickets(101, passengerList);
        
        System.out.println("Now printing the ticket details...");
        TicketService.showTicketDetails(1);
        
        System.out.println("\n\n");
        
 TrainService.searchTrainsBetweenStation("Hyderabad", "Bangalore", LocalDate.now(), 10);
    
 int balanceAfterBooking=b1.getActBalance();
        System.out.println("Initial balance= " + initialBalance);
        System.out.println("Balance After Booking: "+balanceAfterBooking); 
        }
        
        else{
            System.out.println("Invalid credentials");
        }
       
    }
}

