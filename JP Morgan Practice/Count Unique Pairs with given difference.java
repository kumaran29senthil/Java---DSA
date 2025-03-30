import java.util.*;

public class PairsWithDiff {
    public static int countPairs(int[] arr, int k) {
        Arrays.sort(arr); // Step 1: Sort the array
        int i = 0, j = 1, count = 0;
        
        while (j < arr.length) { // Step 2: Two pointer approach
            int diff = arr[j] - arr[i];
            if (diff == k) {  // Step 3: Valid pair found
                count++; 
                i++; 
                j++;
            } else if (diff < k) { // Step 4: Increase j for larger difference
                j++;
            } else { // Step 5: Increase i for smaller difference
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 2};
        int k = 2;
        System.out.println(countPairs(arr, k)); // Output: 3
    }
}
