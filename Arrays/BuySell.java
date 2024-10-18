import java.util.*;
public class BuySell{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of array prices:");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the prices array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        int mini=arr[0],profit=0;
        for(int i=0;i<n;i++)
        {
          int cost=arr[i]-mini;
          profit=Math.max(profit,cost);
          mini=Math.min(mini,arr[i]);
        }
        System.out.printf("The Profit is %d\n",profit);
    }
}