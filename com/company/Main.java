package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte tři čísla: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        
      if (x > y && x>z) {
        System.out.println("Největší číslo je " + x);
      }
      else if (z>y) {
System.out.println("Největší číslo je " + z);
      }
      else {
        System.out.println("Nejvetší číslo je " + y);
      }
      
         
        
       
    }
}
