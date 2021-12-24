package patikaDev;

import java.util.Scanner;

public class etkinlikOnerme {
    
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        int temp = inp.nextInt();

        if(temp<25)
        {   
            if(temp>15)
            {
                System.out.println("Pikniğe gidebilirsiniz");
            }else{
                if(temp>5)
                {
                    System.out.println("Sinamaya gidebilirsiniz");
                }else{
                    System.out.println("Kayak yapmaya gidebilirsiniz.");
                }
            }
        }else{
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
