public class recursive_fib {
    public static void fib(int n,int a,int b)
    {
        if(n==0)
        {
            return;
        }
        System.out.println("Fibonacce series:"+a);
        fib(n-1,b,a+b);
    }
    public static void main(String[] args)
    {
        int n=6;
        fib(n,0,1);
    }
}
