package patikaDev;

import java.util.Scanner;

public class DonguPratik3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen bir sayı girin:");
        int sayi = inp.nextInt();
        int pow5=0;
        int pow4=0;

        System.out.println("4 ve 5 in kuvvetleri:");

        while(pow4<sayi && pow5<sayi){
            pow4*=pow4;
            pow5*=pow5;
            System.out.println(""+pow4+" "+pow5);
        }
        

    }
}
