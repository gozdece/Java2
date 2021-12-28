package patikaDev.Donguler;

import java.util.Scanner;

public class DonguPratik10 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı girin:");
        int numberOne = inp.nextInt();

        System.out.print("Bir sayı girin:");
        int numberTwo= inp.nextInt();

        int enKucuk;
        if(numberOne>numberTwo)
        {
            enKucuk=numberTwo;
        }else{
            enKucuk=numberOne;
        }

        for(int i=enKucuk; i>1; i--)
        {
            if(numberOne%i==0 && numberTwo%i==0)
            {
                System.out.println("Ebob:"+i);
                break;
            }
        }

        for(int i=1; i<=numberOne*numberTwo; i++)
        {
            if(i%numberOne==0 && i%numberTwo==0)
            {
                System.out.println("Ekok:"+i);
                break;
            }
        }
        int i = enKucuk;
        while(enKucuk>1)
        {
            if(numberOne%i==0 && numberTwo%i==0)
            {
                System.out.println("Ebob:"+i);
                break;
            }
            i--;
        }

        int x=1;
        while(enKucuk<numberOne*numberTwo)
        {
            if(x%numberOne==0 && x%numberTwo==0)
            {
                System.out.println("Ekok:"+x);
                break;
            }
            x++;
        }
    }
    
}
