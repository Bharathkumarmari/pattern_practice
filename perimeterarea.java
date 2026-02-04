import java.util.*;
class rectangle
{
    void getinput()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter hte length:");
        int l = s.nextInt();
        System.out.print("Enter the breadth:");
        int b = s.nextInt();
    
    }
}
class perimeterarea extends rectangle
{
    void perimeter()
    {
        int a=2*(l+b);
        System.out.print("Perimeter"+a);
    }

    void area()
    {
        int c=l*b;
        System.out.print("Breadth:"+c);
    }
     public static void main(String[] args) {
            perimeterarea lokesh = new perimeterarea();
            lokesh.getinput();
            lokesh.perimeter();
            lokesh.area();
        }

}