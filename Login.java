
package railwayreservation;


import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner; 

public class Login {
  


    public static boolean UserLogin() throws Exception{
        File f2= new File("C://railwayReservation/src/railwayreservation/UserCredentials.txt");
        FileInputStream fis=null;
        try{
            fis=new FileInputStream(f2);
            Scanner sc=new Scanner(System.in);
           
            String id,pass;
            System.out.println("Enter ID: ");
           
            id=sc.nextLine();
            System.out.println("Enter Password: ");
            pass= sc.nextLine();
            String combined=id.toLowerCase()+ pass;
            
            byte whole[]=new byte[(int)f2.length()];
            fis.read(whole);
            String validCombinations= new String(whole);
            
            if(validCombinations.contains(combined)){
                System.out.println("Valid, welcome");
                return true;
           }
            else if(validCombinations.contains(id.toLowerCase())){
                System.out.println("Wrong Password");
                return false;
            }
            else{
                System.out.println("You are not registered, first register");
                return false;
            }
            
           
           
           
            
            
        }
        finally{
            fis.close();
        }
    }
    
}

