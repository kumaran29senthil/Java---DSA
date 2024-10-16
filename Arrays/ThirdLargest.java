import java.util.Scanner;
public class ThirdLargest{
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
        int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE,third=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
           if (arr[i] > first) { 
                third = second; 
                second = first; 
                first = arr[i]; 
            } 
            else if (arr[i] > second) { 
                third = second; 
                second = arr[i]; 
            } 
            else if (arr[i] > third) { 
                third = arr[i]; 
            } 
        } 
       System.out.printf("The third Largest element is %d\n", third); 
    }
} 
