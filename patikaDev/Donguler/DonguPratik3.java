package patikaDev.Donguler;

import java.util.Scanner;

public class DonguPratik3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen bir sayı girin:");
        int sayi = inp.nextInt();
        
        System.out.println("4 un katları:");

        for(int i=4; i<=sayi; i*=4)
        {   
            System.out.print(" "+i);
        }
        System.out.println();
        System.out.println("5 in katları:");

        for(int i=5; i<=sayi; i*=5)
        {   
            System.out.print(" "+i);
        }
        
        
   

    }
}
