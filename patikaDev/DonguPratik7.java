package patikaDev;

import java.util.Scanner;

public class DonguPratik7 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir satı girin:");
        int sayi = inp.nextInt();
        double toplam=0;

        for(int i=1; i<=sayi; i++)
        {
            toplam+=1.0/i;
            
        }
        System.out.println(toplam);
        
    }
}
