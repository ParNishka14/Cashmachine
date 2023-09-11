package org.example;
import java.util.Scanner;

public class MyOwnScanner {
    public static int nextInte() {
        Scanner sc = new Scanner(System.in);
        int x;
        try {
            x = sc.nextInt();
            return x;
        } catch (Exception e) {
            return -1;
        }
    }
}
