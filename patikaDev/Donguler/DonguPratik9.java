package patikaDev.Donguler;

import java.util.Scanner;

public class DonguPratik9 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String nickName,password;
        int right=3;
        int secim=0;
        int bakiye =1500;

        do {
            System.out.print("Kullanıcı adınızı girin:");
            nickName = inp.next();

            System.out.println();
            System.out.print("Şifrenizi girin:");
            password = inp.next();

            if(nickName.equals("patika") && password.equals("dev"))
            {
                System.out.println("Yapmak istediğiniz işlemi seçin.");
                System.out.println("1-Para çekme 2-Para yatırma 3-Bakiye sorgula 4-Çıkış yap");
                secim = inp.nextInt();

                switch (secim) {
                    case 1:
                        System.out.print("Çekmek istediğiniz tutarı girin:");
                        bakiye-=inp.nextInt();
                        System.out.print("Hesabınızda kalan bakiye:"+bakiye);
                        break;
                    case 2:
                        System.out.print("Yatırmak istediğiniz tutarı girin:");
                        bakiye+=inp.nextInt();
                        System.out.print("Hesabınızdaki bakiye:"+bakiye);
                        break;
                    case 3:
                        System.out.print("Hesabınızdaki bakiye:"+bakiye);
                        break;
                
                    default:
                        System.out.println("Yanlış tuşlama yaptınız.");
                        break;
                }

            }else{
                System.out.println("Şifre ya da kullanıcı adı yanlış.");
                right--;
            }
        } while (right>0);

    }
    
}
