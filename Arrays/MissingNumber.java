import java.util.Scanner;
public class MissingNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of array elements:");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n-1;i++)
        {
            arr[i]=scanner.nextInt();
        }
        int XOR1=0,XOR2=0;
        for(int i=0;i<n-1;i++)
        {
          XOR2=XOR2^arr[i];
          XOR1=XOR1^(i+1);
        }
        XOR1=XOR1^n;
       int misnum=XOR1^XOR2;
         import java.util.Arrays;
// Alternative Approach
// class Solution {
//     public int missingNumber(int[] nums) {
//         int n = nums.length;
//         int eSum = n * (n + 1) / 2; 
//         int aSum = 0;

//         for (int num : nums) {
//             aSum += num;
//         }

//         return eSum - aSum; // Missing number
//     }
// }

       System.out.printf("The Missing Number in an Array is:%d\n",misnum);
   }
}
