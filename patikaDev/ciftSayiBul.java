package patikaDev;

import java.util.Scanner;

public class ciftSayiBul {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı girin:");
        int number1 = inp.nextInt();
        int toplam=0;

        for(int i=0; i<=number1; i++)
        {
            if((i%3==0) && (i%4==0))
            {
                toplam+=i;
            }
        }

        System.out.print("3 ve 4 e bölünen sayıların toplamı:"+toplam);
        
    }
    
}
