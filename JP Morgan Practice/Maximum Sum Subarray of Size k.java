// Fixed-size Sliding Window
import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];
    for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      int k = sc.nextInt();
    System.out.println(maxSumSubarray(arr, k));
  }
  public static int maxSumSubarray(int []arr,int k)
  {
    int n = arr.length;
    if(n<k) return -1;
    int winsum=0;
    for(int i=0;i<k;i++)
      {
        winsum+=arr[i];
      }
    int maxsum = winsum;
    for(int i=k;i<n;i++)
      {
        winsum+=arr[i]-arr[i-k];
        maxsum=Math.max(winsum,maxsum);
      }
    return maxsum;
  }
}
