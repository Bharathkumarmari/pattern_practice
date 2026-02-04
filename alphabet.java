import java.util.*;
public class alphabet {
    
    public static void main(String[] args)
    {
        
        Scanner s = new Scanner(System.in);
        char  ch=s.next().charAt(0);
     
        if (ch>='a' && ch<='z')
        {
             System.out.println((int)ch-96);
        }
        else if(ch>='A'&&ch<='Z')
        {
            System.out.println((int)ch-64);
        }
       else
       {
        System.out.println("Give alphabet a to z and A to z...");
       
       }
        
       
      
    }



}
