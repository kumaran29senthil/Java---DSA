import java.util.*;
public class OccurenceCount{
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
        System.out.println("Enter the original number which is present in array:");
        int Orn=scanner.nextInt();
        int Final_Orn=0;
        for(int i=0;i<n;i++)
        {
          if(arr[i]==Orn)
          {
           Orn=arr[i]*2;
           Final_Orn=Orn;
          }
        }
        System.out.printf("The Final Original Number is %d\n",Final_Orn);
    }
}
      