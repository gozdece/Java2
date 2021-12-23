package patikaDev;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class kullaniciGiris {
    public static void main(String[] args) {
        
        String _userName ="patika";
        String _password="123";

        Scanner inp = new Scanner(System.in);

        System.out.println("Giriş yapmak için bilgilerinizi girin.");
        System.out.println("Kullanıcı adınız:");
        String userName = inp.nextLine();
        System.out.print("Şifreniz:");
        String password = inp.nextLine();

        if(userName.equals(_userName))
        {
            if(password.equals(_password))
            {
                System.out.println("Tebrikler. Giriş yaptınız.");
            }else{
                System.out.println("Şifre yanlış. Değiştirmek ister misiniz [y/n]");
                String secim = inp.next();

                if(secim.equals("evet"))
                {
                    System.out.print("Yeni şifre girin:");
                    String newpass= inp.next();

                    while(_password.equals(newpass)){

                        System.out.println("Şifre eskisiyle aynı olamaz. Başka bir şifre deneyin.");
                        newpass = inp.next();
                    }

                    if(!(_password.equals(newpass)))
                    {
                        _password= newpass;
                        System.out.println("Şifreniz başarıyla değişti.");
                    }
                }
            }
        }else{
            System.out.println("Lütfen kullanıcı adınızı doğru girin.");
        }
        
    }
}
