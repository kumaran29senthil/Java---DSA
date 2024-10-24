import java.util.*;
public class solution {
    public static int firstOccurrence(int n, int key, int[] arr) {
        int left = 0;
        int right = n - 1;
        int res = -1;
        while (left <= right) {
            int mid = (left + right) / 2;  
            if (arr[mid] == key) {
                res = mid;         
                right = mid - 1;  
            } else if (key < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res;
    }
    public static int lastOccurrence(int n, int key, int[] arr) {
        int left = 0;
        int right = n - 1;
        int res = -1;

        while (left <= right) {
            int mid = (left + right) / 2; 
            if (arr[mid] == key) {
                res = mid;          
                left = mid + 1;   
            } else if (key < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res;
    }

    public static void main(String args[]) {
        int n = 7;
        int key = 13;
        int[] arr = {3, 4, 13, 13, 13, 20, 40};
        int first = firstOccurrence(n, key, arr);
        int last = lastOccurrence(n, key, arr);
        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
    }
}
