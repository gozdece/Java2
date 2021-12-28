package patikaDev.Donguler;

public class DonguOdev4 {
    public static void main(String[] args) {
        
        boolean kosul =true; //asaldır
        for(int i=2; i<=100; i++)
        {
            for(int j=2; j<=i; j++)
            {
                if(i!=j)
                {
                    if(i%j==0)
                    {
                        kosul=false;
                        break;
                       // System.out.println(""+i+" sayısı "+j+" sayısına tam bölünür.");
                        //System.out.println("i sayısı asal sayı değildir.");
                    }
                }
                
                
            }
          if(kosul==true)
          {
              System.out.println(""+i+" sayısı asaldır");
             
          }
          kosul=true;
          
        }
    }
}
