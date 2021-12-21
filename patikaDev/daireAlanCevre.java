package patikaDev;

import java.util.Scanner;

public class daireAlanCevre {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yarıçap uzunluğunu girin:");
        int r = inp.nextInt();

        System.out.print("Dairenin merkez açısını girin:");
        int aci = inp.nextInt();

        double pi =3.14;

        double alan = (pi * r * r * aci)/360;

        System.out.println("Dairenin alanı : "+alan);
    }
    
}
