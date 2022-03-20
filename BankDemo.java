package com.company;

import java.util.Scanner;
class BankDemo {
    public static void main(String args[]) throws InsufficientFundException {
        SavingAccount obj = new SavingAccount();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount you wanna withdraw:");
        double amount = sc.nextDouble();
        try{
            double bal = obj.withdraw(amount);


        }
        catch (InsufficientFundException e){
            System.out.println("Enter the amount which is lesser than your balance!");

        }

        System.out.println("Your current balance is:" + obj.balance);

    }
}



