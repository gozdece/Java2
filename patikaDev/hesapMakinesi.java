package patikaDev;

import java.util.Scanner;

public class hesapMakinesi
 {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı girin:");
        int firstNum = inp.nextInt();

        System.out.print("İkinci sayıyı girin:");
        int secNum = inp.nextInt();

        System.out.println("Yapılacak işlemi seçin:");
        System.out.println("1-Toplama");
        System.out.println("2-Çıkarma");
        System.out.println("3-Çarpma");
        System.out.println("4-Bölme");

        int secim = inp.nextInt();
        double sonuc=0;

        switch (secim) {
            case 1:
                sonuc = firstNum +secNum;
                break;
            case 2:
                sonuc = firstNum-secNum;
                break;
            case 3:
                sonuc = firstNum*secNum;
                break;
            case 4:
                sonuc = firstNum/secNum;
                break;
        
            default:
                secim=5;
                break;
        }
        if(secim == 5)
        {
            System.out.println("Geçerli bir işlem girmediniz.");

        }else{
            System.out.println("İşlem sonucu:"+ sonuc);
        }
        
    }
}
    

