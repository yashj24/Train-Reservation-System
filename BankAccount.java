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
public class BankAccount {
    private int actNumber;
    private int actBalance;

    public int getActNumber() {
        return actNumber;
    }

    public void setActNumber(int actNumber) {
        this.actNumber = actNumber;
    }

    public int getActBalance() {
        return actBalance;
    }

    public void setActBalance(int actBalance) {
        this.actBalance = actBalance;
    }
    
    public void deposit(int amount){
        actBalance+=amount;
    }
    
    public void withdraw(int amount){
        actBalance-=amount;
    }
    
    public void showBalance(){
        System.out.println("Account Balance= "+actBalance);
    }
}
