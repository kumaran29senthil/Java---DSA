import java.util.Scanner;
public class SortArray{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of array elements:");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        int low=0,mid=0,high=n-1;
        while(mid<=high)
        {
          if(arr[mid]==0)
          {
            int temp=arr[low];
            arr[low]=arr[mid];
            arr[mid]=temp;
            low++;
            mid++;
          }
          else if(arr[mid]==1)
          {
             mid++;
          }
          else{
            int temp=arr[high];
            arr[high]=arr[mid];
            arr[mid]=temp;
            high--;
         }
       }
       for(int i=0;i<n;i++)
       {
         System.out.print(arr[i]+" ");
       }
   }
}