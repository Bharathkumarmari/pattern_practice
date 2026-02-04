public class pattern14 {
    public static void main(String[] args) {
    int n=8;
    diamond d=new diamond();
    d.display(n);
    d.dis(n);
    }
}
class diamond
{
    
    void display(int n)
    {
        int space=n-1;
        for(int k=1;k<=n;k++)
        {
            for(int j=0;j<space;j++)
            {
                System.out.print(" ");
            }
            for(int l=1;l<=k;l++)
            {
                System.out.print("* ");
            }
            System.out.println();
            space--;
        }
    }
    void dis(int n)
    {
        int space=0;
        for(int i=1;i<=n;i++) 
        {
             for(int k=0;k<space;k++)
             {
                System.out.print(" ");
             }
             for(int h=n;h>i;h--)
             {
                System.out.print(" *");
             }System.out.println(" ");
             space++;
        }
    }
}