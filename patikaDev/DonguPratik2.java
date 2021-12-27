package patikaDev;

import java.util.Scanner;

public class DonguPratik2 {
    
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        int toplam=0;
        int dongu=0;
        int sayi;
        
        do {
            System.out.print("Bir sayı girin:");
            sayi = inp.nextInt();
            
            if(sayi%2==0){
                if(sayi%4==0){
                    toplam+=sayi;
                    dongu++;
                }
            }
        }while (sayi%2==0);

        System.out.print("Çift ve 4un katı olan sayıların toplamı:"+toplam);
    }
    
}
