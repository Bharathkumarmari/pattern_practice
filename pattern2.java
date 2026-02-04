// import java.util.*;
// class pattern2
// {
//     public static void main(String[] args) {
//         int m=9;
        
//         for(int i=1;i<=5;i++)
//         {
          
                
//             for(int j=9;j>=1;j--)
//             {
                
               
//                 System.out.print("*");
//             }
        
//             \
//             System.out.println(" ");
        
       
//     }

// }
// }
import java.util.*;
class pattern2
{
    public static void main(String[] args) {
        String str = "*";
        
        for(int i=9;i>=0;i=i-2)
        {
           System.out.println(str.repeat(i));
        }

}
}
