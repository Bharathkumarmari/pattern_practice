import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class today {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter num:");
        int n = s.nextInt();
        int[] x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=s.nextInt();
        }

        System.out.println("KEY:");
        int key=s.nextInt();
        int index=-1;
        for(int i=0;i<n;i++)
        {
            if(key==x[i])
            {
                index=i;
                break;
            }
        }
        if(index!=-1)
        {
            for(int j=index;j<n;j++)
            {
                System.out.print(x[j]+"\t");
            }
        }
        else
        {
            System.out.println("-1");
        }

    }}
