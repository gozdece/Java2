package patikaDev;

import java.util.Scanner;

public class DongulerPratik6 {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı girin:");
        int sayi = inp.nextInt();
        int toplam=0;

       while(sayi>10)
       {
           toplam += sayi%10;
            sayi/=10;
       }
       toplam+=sayi;
       System.out.println("Girilen sayının basamaklarının toplamı:");
       System.out.println(toplam);
        
    }
}
