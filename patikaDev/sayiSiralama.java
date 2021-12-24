package patikaDev;

import java.util.Scanner;

public class sayiSiralama {
    
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Birinci sayıyı girin:");
        int number1 = inp.nextInt();

        System.out.print("İkinci sayıyı girin:");
        int number2 = inp.nextInt();

        System.out.print("Üçüncü sayıyı girin:");
        int number3 = inp.nextInt();

        if(number1>number2 && number1>number3)
        {
            if(number2>number3)
            {
                System.out.println("1.sayı > 2.sayı > 3.sayı");
            }else{
                System.out.println("1.sayı > 3.sayı > 2.sayı");
            }
        }else if(number2>number1 && number2>number3)
        {
            if(number1>number3)
            {
                System.out.println("2.sayı > 1.sayı > 3.sayı");
            }else{
                System.out.println("2.sayı > 3.sayı > 1.sayı");
            }
        }else
        {
            if(number1>number2)
            {
                System.out.println("3.sayı > 1.sayı > 2.sayı");
            }else{
                System.out.println("3.sayı > 2.sayı > 1.sayı");
            }
        }

    }
}
