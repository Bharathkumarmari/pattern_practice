public class pattern12 {
    public static void main(String[] args) {
        downtriangle t=new downtriangle();
        t.tri(5);
        uptriangle tr=new uptriangle();
        tr.tria(4);
    }
}
class downtriangle
{
    void tri(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int k=n-i;k>=1;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int h=2;h<=i;h++)
            {
                System.out.print("*");
            }
            
            
            System.out.println();
        }
    }
}

class uptriangle
{
    void tria (int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=i;k++)
            {
                System.out.print(" ");
            }
            for(int h=n;h>=i;h--)
    {
                System.out.print("*");
            }
           for(int j=3;j>=i;j--)
           {
               System.out.print("*");
           }
            
        
                
          
            
            
            System.out.println(" ");
        }
    }
}





