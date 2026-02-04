import java.util.Scanner;

public class compare_strinng
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1="Bharath";
        String str2="harini";
        int index=0;
    for(int i=0;i<str1.length();i++)
    
        {
            char c = str1.charAt(i);
           if(str2.indexOf(c)!=-1)
           {
            index++;
            System.out.print(c);  
                }
                
        }
        System.out.println();
        System.out.println(index);
    }
}