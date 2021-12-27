package patikaDev.Donguler;

import java.util.Scanner;

public class DonguOdev2 {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        int sayi = inp.nextInt();
        int toplam=0;

        for(int i=1; i<sayi; i++)
        {
            if(sayi%i==0)
            {
                toplam+=i;
                
            }
        }
        
        if(toplam==sayi)
                {
                    System.out.println("Mükemmel sayıdır.");
                }else{
                    System.out.println("Mükemmel sayı değildir");
                }

    }
}
