package org.example;

import registration.Registration;

public class Main {
    public static void main(String[] args) {
        Cashmachine atm = new Cashmachine();
        Registration reg = new Registration();
        reg.registration();
        atm.scanCard(1, false);
    }
}