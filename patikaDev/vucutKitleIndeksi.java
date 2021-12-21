package patikaDev;

import java.util.Scanner;

public class vucutKitleIndeksi {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        double boy = inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        int kilo = inp.nextInt();

        double index = kilo/boy*boy;

        System.out.println("Vücut kitle indeksi: "+index);

    }
}
