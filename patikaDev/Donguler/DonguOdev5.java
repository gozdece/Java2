package patikaDev.Donguler;

import java.util.Scanner;

public class DonguOdev5 {
    
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        int sayi = inp.nextInt();

        int numberOne=0;
        int numberTwo=1;
        int toplam=0;

        System.out.print("Kaç elemanlı seri istiyorsunuz?");

        for(int i=1; i<=sayi; i++)
        {
            toplam=numberOne+numberTwo;
           
            System.out.print(""+numberOne+"-");
            numberOne = numberTwo;
            numberTwo= toplam;
            
        }
       
    }
}
