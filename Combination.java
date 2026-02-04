public class Combination {
    public static void rec(int[] n,int find,int i,int j)
    {
      if(i>=n.length-1)
      {
        return;
      }
      if(j>=n.length)
      {
        rec(n,find,i+1,i+2);
        return;
      }
      if(n[i]+n[j]==find)
      {

        System.out.println(n[i]+ " " +n[j]);
      }
      rec(n,find,i,j+1);
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8,9};
        
        rec(arr,10,0,1);
    }
}
