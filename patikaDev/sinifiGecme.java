package patikaDev;

import java.util.Scanner;

public class sinifiGecme {
    
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        double toplam=0;
        double dersSayisi=0;
        double ortalama=0;

        System.out.print("Matematik notunu girin:");
        double mat = inp.nextDouble();
        
        System.out.print("Fizik notunu girin:");
        double fizik = inp.nextDouble();

        System.out.print("Kimya notunu girin:");
        double kimya = inp.nextDouble();

        System.out.print("Turkce notunu girin:");
        double turkce = inp.nextDouble();

        System.out.print("Muzik notunu girin:");
        double muzik = inp.nextDouble();

        if((mat>0 && mat<100))
        {
            dersSayisi++;
            toplam+= mat;
        }
        if(fizik>0 && fizik<100)
        {
            dersSayisi++;
            toplam+=fizik;
        }
        if(kimya>0 && kimya<100)
        {
            dersSayisi++;
            toplam+=kimya;
        }
        if(turkce>0 && turkce<100)
        {
            dersSayisi++;
            toplam+=turkce;
        }
        if(muzik>0 && muzik<100)
        {
            dersSayisi++;
            toplam+=muzik;
        }

        ortalama = toplam/dersSayisi;
       
        if(ortalama>55)
        {
            System.out.println("Geçtiniz");
        }else{
            System.out.println("Kaldınız");
        }
        
    }
    
}
