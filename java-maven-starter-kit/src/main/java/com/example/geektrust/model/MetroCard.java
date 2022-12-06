package com.example.geektrust.model;

public class MetroCard {
    private String cardNo;
    private double balance;
    public MetroCard(String cardNo, double balance) {
        this.cardNo = cardNo;
        this.balance = balance;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCardNo() {
        return cardNo;
    }

    public double getBalance() {
        return balance;
    }
}
