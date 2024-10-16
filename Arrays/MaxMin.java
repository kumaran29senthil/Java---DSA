import java.util.Scanner;
public class MaxMin{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of array elements:");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        int max=arr[0],min=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("The Maximum Element in an Array is: "+max);
        System.out.println("The Minimum Element in an Array is: "+min);
        scanner.close();
    }
}
