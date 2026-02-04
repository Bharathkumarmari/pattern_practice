import java.util.Scanner;

public class nopatter1 {

public static void patternno(int n)
{
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<i;j++)
        {
            System.out.println("* ");
        }
    }
}



    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        patternno(n);
    }
    
}
