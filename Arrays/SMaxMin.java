import java.util.Scanner;
public class SMaxMin{
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
        int max=Integer.MIN_VALUE,smax=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE,smin=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                smax=max;
                max=arr[i];
            }
            else if(arr[i]>smax && arr[i]<max)
            {
                smax=arr[i];
            }
            if(arr[i]<min)
            {
                smin=min;
                min=arr[i];
            }
            else if(arr[i]<smin && arr[i]>min)
            {
                smin=arr[i];
            }
        }
        System.out.println("The Second Largest Element in an Array is: "+smax);
        System.out.println("The Second Smallest Element in an Array is: "+smin);
        scanner.close();
    }
}
