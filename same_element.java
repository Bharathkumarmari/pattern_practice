import java.util.ArrayList;
import java.util.List;

public class same_element {
    public static void main(String[] args) {
        {
            String s1="aabcce";
            char[] ch=s1.toCharArray();
            List<Character> lst=new ArrayList<>();
            
           
            for(int i=0;i<ch.length;i++)
            {
                boolean isunique=true;
                for(int j=0;j<ch.length;j++)
                {
                    
                    if(ch[i]==ch[j]  && i!=j)
                    {
                       isunique=false;
                       break;
                    }
                }
                    if(isunique  &&  !lst.contains(ch[i]))
                    {
                        lst.add(ch[i]);
                    }
                
            
                }
                for(char c:lst)
                {
                  System.out.println(c);  
                }
               

            }
        }
    }

