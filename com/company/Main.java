package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte tři čísla: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if (x > y) {
            System.out.println("Největší je " + x);
        } else if (x < z) {
            System.out.println("Největší je " + z);
        }
        else {
            System.out.println("Největší je " + y);
        }
       
    }
}
