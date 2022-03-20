package com.company;

public class SavingAccount {
    int accountNumber;
    double balance=5000;

    public void deposite (double amount){
        this.balance+=amount;

    }
    public double withdraw (double amount) throws InsufficientFundException {

        if(amount>this.balance)
            throw new InsufficientFundException("Insufficient Amount in the Account");
        else{
            this.balance=this.balance - amount;
            return this.balance;
        }

    }
}
