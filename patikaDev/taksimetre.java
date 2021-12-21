package patikaDev;

import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int km = inp.nextInt();
        int startPrice =10;
        double kmFiyat =2.20;

        double total =(km*kmFiyat)+startPrice;

        if(total<=20)
        {
            total=20;
            System.out.println("Ödenecek tutar: "+total);
        }else{
            System.out.println("Ödenecek tutar: "+total);
        }
    }
}
