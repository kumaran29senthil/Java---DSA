// appears > n/2 times
import java.util.*;

public class MajorityElement {
    public static int findMajority(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int n = arr.length;
        
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            if (freq.get(num) > n / 2) return num;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(findMajority(arr)); // Output: 2
    }
}
