import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int target=40;
        
        int[] arr={10,20,30,40,50};
       
        int sum=0;
        while(sum<target)
        {
        for(int i=0;i<arr.length;i++)
        {
            if(target!=arr[i])
            sum+=arr[i];

        }
    }

        System.out.print(sum);
    }
}
