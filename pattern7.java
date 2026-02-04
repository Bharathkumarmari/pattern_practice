import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("ENter the number:");
        int n=s.nextInt();
        int count=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(count+" ");
                count++;
            }
            
            System.out.println(" ");
        }
    }
}
