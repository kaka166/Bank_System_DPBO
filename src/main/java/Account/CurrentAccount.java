/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Account;

/**
 *
 * @author VICTUS
 */
public abstract class CurrentAccount extends CustomerAccount {
    

    public CurrentAccount(String accountName, String accountID, double balance) {
        super(accountName, accountID, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit to Current Account: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;   
        }
    } 
    
    @Override
    public double getBalance() {
        interestRate = 1.5/100;
        return balance + balance * interestRate;
    }
}
