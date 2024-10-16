package com.constructors.exercises;

public class BankAccount {

    //instance variables

    String accountNumber;
    double balance;

    // static variables

    static String bankName = "KottackMahindraBank";

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount() {
        accountNumber = "Unknown";
        balance = 0.0;

    }

    //static method
    static String getBankName() {
        return bankName;
    }

    void displayBankInfo() {
        System.out.println("The AccountNumber:" + accountNumber);
        System.out.println("The Account Balance:" + balance);
    }

    public static void main(String[] args) {


        BankAccount bankAccount;
        bankAccount = new BankAccount();

        bankAccount.accountNumber = "21KP1A04131";
        bankAccount.balance = 1.38;
        String bankName1 = BankAccount.getBankName();
        System.out.println(bankName1);
        bankAccount.displayBankInfo();
    }
}
