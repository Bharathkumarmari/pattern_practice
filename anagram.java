import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    static boolean strcheck(String s1,String s2)
    {
        if(s1.length()!= s2.length())
        {
            return false;
        }
         char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2))
        {
        return true;
        }
        return false;

    }
    public static void main(String[] args) {
        {
            Scanner s  = new Scanner(System.in);
            System.out.println("Enter the 2 string: ");
            String str1=s.next();
            String str2=s.next();
            strcheck(str1,str2);
            if(strcheck(str1, str2)==true)
            {
                System.out.println("This is anagram");
            }
            else{
                System.out.println("This is not anagram");
            }
            


        }
    }
}
