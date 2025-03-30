// Two Pointers - Opposite Ends approach (Two sum,Binary search)
import java.util.*;
import java.io.*;
public class Main{
  public static void main(String [] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int target = Integer.parseInt(br.readLine());
    int [] arr = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0;i<n;i++)
      {
        arr[i]=Integer.parseInt(st.nextToken());
      }
    System.out.println(hasPairWithSum(arr,target));
  }
  public static boolean hasPairWithSum(int [] arr , int target)
  {
    int left=0,right=arr.length-1;
    while(left<right)
      {
        int sum = arr[left]+arr[right];
        if(sum==target) return true;
        if(sum<target) left++;
        else right--;
      }
    return false;
  }
}
    
    
