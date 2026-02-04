public class second_largestno {
    public static void main(String[] args) {
        int[] arr={12,35,1,10,30,1};
        int f_largest=-1;
        int s_largest=-1;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>f_largest)
            {
                s_largest=f_largest;
                f_largest=arr[i];
                
                
            }
            else if(arr[i]!=f_largest && arr[i]>s_largest)
            {
                s_largest=arr[i];
            }
        }
      
        System.out.println(s_largest);
    }
}
