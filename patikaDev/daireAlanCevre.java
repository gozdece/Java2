package patikaDev;

import java.util.Scanner;

public class daireAlanCevre {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        
        int r = inp.nextInt();
        double pi =3.14;

        double cevre = 2 * pi * r;
        double alan = pi * r * r;

        System.out.println("Dairenin çevresi : "+cevre);
        System.out.println("Dairenin alanı : "+alan);
    }
    
}
