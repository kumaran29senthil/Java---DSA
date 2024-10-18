import java.util.Scanner;
public class MoveZeros{
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
        int j=-1;
        for(int i=0;i<n;i++)
        {
          if(arr[i]==0)
          {
            j=i;
            break;
          }
        }
        for(int i=j+1;i<n;i++)
        {
          if(arr[i]!=0)
          {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j++;
          }
        }
        for(int i=0;i<n;i++)
        {
          System.out.print(arr[i]+" ");
        }
    }
}

       