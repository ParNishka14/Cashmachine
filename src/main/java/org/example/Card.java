package org.example;

public class Card {
    public int cardNumber;
    private int pin;
    private int cvv;

    boolean blocket = true;

    private int balance;
    public Card(int cardNumber, int pin, int cvv, int balance ){
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.cvv = cvv;
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public int getCvv() {
        return cvv;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isBlocket() {
        return blocket;
    }

    public void setBlocket(boolean blocket) {
        this.blocket = blocket;
    }
}
