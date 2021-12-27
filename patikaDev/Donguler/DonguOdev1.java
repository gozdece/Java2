package patikaDev.Donguler;

import java.util.Scanner;

public class DonguOdev1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz:");
        int N= inp.nextInt();
        int min=0;
        int max=0;


        for(int i=1; i<=N;i++)
        {
            System.out.print(""+i+".sayıyı giriniz:");
            int number = inp.nextInt();

            if(i==1){
                min=number;
            }else{
                if(number<min)
                {
                    min=number;
                }else{
                    max=number;
                }
            }

            
        }
        
        System.out.println("Max deger:"+max);
        System.out.println("Min deger:"+min);
    }
    
}
