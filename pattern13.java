//Right diamond triangle

class uppertriangle
{
    int n;
uppertriangle(int n)
{
    this.n=n;
}
void display()
{
for(int i=1;i<=n;i++)
{
    for(int j=1;j<=i;j++)
    {
        System.out.print("* ");
    }System.out.println("");

}

}
 void display1()
{
for(int i=1;i<=n;i++)
{
    for(int j=i-1;j<=n;j++)
    {
        System.out.print("* ");
    }System.out.println("");
}
}
}





public class pattern13 {
    public static void main(String[] args) {
        uppertriangle t =new uppertriangle(5);
        t.display();
        t.display1();
    }

}
