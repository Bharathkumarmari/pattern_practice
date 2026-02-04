public class pattern10 {
    public static void main(String[] args) {
        chartriangle t = new chartriangle();
        t.printpattern(5);
    }
}
class chartriangle
{
    int count =0;
    void printpattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)(count+65)+" ");
                count=count+1;
            }
           
            System.out.println(" ");
        }
    }
}