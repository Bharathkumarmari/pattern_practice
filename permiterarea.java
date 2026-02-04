import java.util.*;
class rectangle
{
    void getinput()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter hte length:");
        int length = s.nextInt();
        System.out.print("Enter the breadth:");
        int breadth = s.nextInt();
    
    }
}
class perimeterarea extends rectangle
{
    void perimeter()
    {
        System.out.println("Perimeter"+(2*(length+breadth)));
    }

    void area()
    {
        System.out.print("Breadth:"+(lenght*breadth));
    }
     public static void main(String[] args) {
            perimeterarea lokesh = new perimeterarea();
            lokesh.getinput();
            lokesh.perimeter();
            lokesh.area();
        }

}