package com.mitchell.ian.Day6;

public class Q5Banks {
    public static void main(String[] args) {

        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        System.out.println(bankA.getBalance());
        System.out.println(bankB.getBalance());
        System.out.println(bankC.getBalance());
    }
}
