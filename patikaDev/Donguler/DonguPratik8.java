package patikaDev.Donguler;

import java.util.Scanner;

public class DonguPratik8 {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi = inp.nextInt();

     
        for(int i=1; i<=sayi; i++)
        {
            for(int j=1; j<=sayi-i; j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i)-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
            
        }

        for(int i=sayi-1; i>=1; i--)
        {
            for(int j=sayi-i; j>=1; j--)
            {
                System.out.print(" ");
            }
            for(int k=(2*i)-1; k>=1;k--)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
    }
}
