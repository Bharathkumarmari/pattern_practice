public class pattern11 {
    public static void main(String[] args) {
        ktriangle t = new ktriangle(5);
        t.tri();
    }
    
}
class ktriangle{
    int n;
    public ktriangle(int n)
    {
       this.n=n;
       
    }
    public void tri(){

       for(int i =1;i<=n;i++)
       {
        
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=n-i;k++)
            {
                System.out.print("*");
              

            }System.out.println(" ");
             
        }

        for(int j=n;j>=i;j--)
        {
            System.out.print("* ");
        }System.out.println(" ");
        
       
       }
       for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++)
        {
            System.out.print("* ");
        }System.out.println(" ");
       }
        
       
       
       
        
    }

