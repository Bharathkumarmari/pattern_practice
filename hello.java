import java.util.*;

class hello{
    public static void main(String args[])
    {
    
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter person name ");
    String name = scanner.nextLine();
    System.out.println("ENter age");
    int age = scanner.nextInt();
    System.out.println(name+":"+age+"-name :age"+"!");
    String reverse = new StringBuilder(name).reverse().toString();
    System.out.print(reverse);
    }
}