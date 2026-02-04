import java.util.*;
class stringcomparison
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Eter the text:");
        String s1 = s.nextLine();
        System.out.println("Enter the pattern:");
        String s2 = s.next();
        if(s1.contains(s2))
        {
            System.out.println("amada adhula  thaa  iruku");
        }
        else{
            System.out.println("Adhalaila iladaa gundu paiya");
        }
        s.close();
    }
}