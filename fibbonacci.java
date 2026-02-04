    import java.util.Scanner;
    class fibbonacci {
        void fib(int n,int n1,int n2)
            {
                
                int result=0;
                for(int i=0;i<n;i++)
                {
                    
                    result=n1+n2;
                    n1=n2;
                    n2=result;
                    
                }
                System.out.print(n1);
                
            }
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the Number:");
            int num=6;
            
            fibbonacci f=new fibbonacci();
            f.fib(num,0,1);
        }
    }
