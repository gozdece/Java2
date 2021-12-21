package patikaDev;

import java.util.Scanner;

public class manavKasa {

    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        double vArmut = 2.14;
        double vElma = 3.67;
        double vDomates = 1.11;
        double vMuz = 0.95;
        double vPatlican = 5;

        System.out.print("Armut kaç kilo? :");
        double armut = inp.nextDouble();

        System.out.print("Elma kaç kilo? :");
        double elma = inp.nextDouble();

        System.out.print("Domates kaç kilo? :");
        double domates = inp.nextDouble();

        System.out.print("Muz kaç kilo? :");
        double muz = inp.nextDouble();

        System.out.print("Patlican kaç kilo? :");
        double patlican = inp.nextDouble();
        
        double toplam = (vArmut*armut)+(vElma*elma)+(vDomates*domates)+(vMuz*muz)+(vPatlican*patlican);
        System.out.print("Toplam tutar: "+toplam);
    }
    
}
