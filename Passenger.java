/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package railwayreservation;

/**
 *
 * @author HP
 */
class Passenger {
    private int passengerId;
    private String passengerName;
    private int age;
    private BankAccount bankAccount;

    
    public Passenger(){
        super();
    }
    public Passenger(int passengerId, String passengerName, int age, BankAccount bankAccount) {
        this.passengerId = passengerId;
        this.passengerName = passengerName;
        this.age = age;
        this.bankAccount = bankAccount;
    }

    public int getPassengerId() {
        return passengerId;
    }
    
    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
    
}
