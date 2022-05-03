/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package railwayreservation;


import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Register {
    
   
    public static void main(String[] args) throws Exception{
        File f1= new File("C://railwayReservation/src/railwayreservation/UserCredentials.txt");
        FileOutputStream fos=null;
        Scanner sc=new Scanner(System.in);
        try{
            fos=new FileOutputStream(f1,true);
            fos.flush();
            
            String userId,pass;
            
            System.out.println("Enter user ID: ");
            userId=sc.nextLine();
            
            
            System.out.println("Enter Password: ");
            pass=sc.nextLine();
            
            
            byte UserByte[]=userId.getBytes();
            byte passByte[]=pass.getBytes();
            fos.write(UserByte);
            fos.write(passByte);

            
            
            
        }
        finally{
            fos.close();
        }
        
    }
}

