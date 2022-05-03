

package railwayreservation;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;


public class TrainService {
    private static List<Train> allTrains = new LinkedList<>();
    
    static{
        allTrains.add(new Train(101,"Train-one","Hyderabad","Bangalore",100,800,LocalDate.now()));    
        allTrains.add(new Train(102,"Train-Two","Bangalore","Hyderabad",100,800,LocalDate.now()));
        allTrains.add(new Train(103,"Train-three","Indore","Bhopal",80,600,LocalDate.now()));
        allTrains.add(new Train(104,"Train-four","Mumbai","Pune",120,700,LocalDate.now()));
        allTrains.add(new Train(105,"Train-five","Hyderabad","Bangalore",100,1500,LocalDate.now()));
         }

    static void searchTrainsBetweenStations(String hyderabad, String bangalore, LocalDate now, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    public TrainService(){
        super();
    }
    public static Train findTrain(int trainNumber){
        Train temp = null;
        for(Train t: allTrains){
            if(t.getTrainNumber()==trainNumber){
                temp=t;
                break;
            }
        }
    return temp;
    }
    

    public static void searchTrainsBetweenStation(String fromStation,String toStation, LocalDate doj,int numOfSeats) {
    
        List<Train> searchTrainList=new LinkedList<>();
        for(Train t:allTrains){
            if(t.getFromStation().equals(fromStation) &&
               t.getToStation().equals(toStation) &&
               t.getDoj().equals(doj) &&
               t.getSeatsAvailable()>numOfSeats){
                searchTrainList.add(t);
            }
    }
        if(searchTrainList.isEmpty()){ 
            System.out.println("Sorry, no trains/seats available");
        }
        else{
        System.out.println("Train No.\t Train Name\t From Station\t To Station\t Date Of Journey\t Seats Available\t Fare");
        System.out.println();
        for(Train t: searchTrainList){
            System.out.println(t.getTrainNumber() + " \t \t"+ t.getTrainName() + " \t"+ t.getFromStation() + "\t"+ t.getToStation() + " \t \t"+ t.getDoj() + " \t \t" + t.getSeatsAvailable() + " \t \t"+ t.getFare());
        }
        }
    
    
    
}
    
    public static void bookTickets(int trainNumber,List<Passenger> passengerList){
        // subtract train fare for all passengers together from bank account object
        
        int numOfSeats=passengerList.size();
//       
        
     
//        BankAccount account=tempPassenger.getBankAccount();
        BankAccount account=passengerList.get(0).getBankAccount();
      
        
        Train tempTrain = findTrain(trainNumber);
        int fare=tempTrain.getFare();
        int totalFare= fare * numOfSeats;
        account.withdraw(totalFare);
        
        
        // then subtract the number of tickets that are being booked, from actual available tickets
       tempTrain.setSeatsAvailable(tempTrain.getSeatsAvailable()-numOfSeats);
        
        //add one entry into tickets collection.
       TicketService.addNewTicket(trainNumber,passengerList);
    }
}
