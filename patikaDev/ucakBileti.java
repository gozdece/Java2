package patikaDev;

import java.util.Scanner;

public class ucakBileti {
    
    public static void main(String[] args) {
        
        double km =0;
        int yas =0;
        int tip =0;
        double indirimTutar=0;

        Scanner inp = new Scanner(System.in);
        
        System.out.print("Mesafeyi km türünden girin:");
        km = inp.nextDouble();

        System.out.print("Yaşınızı girin:");
        yas = inp.nextInt();

        System.out.print("Yolculuk tipini girin: 1: tek yön 2:gidiş dönüş");
        tip = inp.nextInt();

        if(yas>0)
        {
            if(km>0)
            {
                if(!(tip==1 || tip==2))
                {
                    System.out.println("Lütfen 1 veya 2 değeri girin. ");
                }
            }else
            {
                System.out.println("Lütfen km için pozitif  bir değer girin.");
            }
        }else{
            System.out.println("Lütfen yas için pozitif bir değer girin.");
        }

        if(yas<12)
        {
            indirimTutar=0.50;
        }else if(yas>=12 && yas<=24)
        {
            indirimTutar=0.10;
        }else if(yas>=65)
        {
            indirimTutar=0.30;
        }
             
        double normalTutar = km * 0.10;
        double yasIndirim = normalTutar*indirimTutar;
        double indirimliTutar = normalTutar - yasIndirim;
        double gidisDonus = indirimliTutar * 0.20;
       
        if(tip==2)
        {
            double toplam = (indirimliTutar-gidisDonus)*2;
            System.out.println(""+toplam);
        }else{
            double toplam = indirimliTutar;
            System.out.println(""+toplam);
        }
        
        
    }
}
