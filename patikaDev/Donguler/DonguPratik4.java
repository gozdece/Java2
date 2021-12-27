package patikaDev.Donguler;

import java.util.Scanner;

public class DonguPratik4 {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı girin(N):");
        int numberOne = inp.nextInt();

        System.out.print("Bir sayı girin(r):");
        int numberTwo = inp.nextInt();

        int kombinasyon =0;
        int numberOneFak=1;
        int numberTwoFak=1;
        int fark=numberOne-numberTwo;
        int farkFark=1;

        for(int i=1; i<=numberOne; i++)
        {
            numberOneFak*=i;       
        }

        for(int i=1; i<=numberTwo; i++)
        {
            numberTwoFak*=i;
        }

        for(int i=1; i<=fark; i++)
        {
            farkFark*=i;
        }

        kombinasyon = numberOneFak / (numberTwoFak * farkFark );
        System.out.print("Kombinasyon sonucu:"+kombinasyon);

        

    }
}
