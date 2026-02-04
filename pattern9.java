import java.util.Scanner;
class chartriangle{
    void printpattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)(65+i)+" ");
            }System.out.println(" ");
        }
    }
}

public class pattern9 {
    public static void main(String[] args) {
       chartriangle t = new chartriangle();
       t.printpattern(5);
    }
}
