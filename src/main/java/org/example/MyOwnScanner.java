package org.example;
import java.util.Scanner;

public class MyOwnScanner {
    static Scanner sc = new Scanner(System.in);
    public static int nextInte() {
        int x;
        try {
            x = sc.nextInt();
            return x;
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
    }
    public static long nextLong() {
        long x;
        try {
            x = sc.nextLong();
            return x;
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
    }
}
