class Solution {
    static boolean searchInSorted(int arr[], int k) {
        // Your code here
        int left=0,right=arr.length-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(arr[mid]==k) 
            {
                return true;
            }
            else if(arr[mid]<k)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return false;
    }
}
