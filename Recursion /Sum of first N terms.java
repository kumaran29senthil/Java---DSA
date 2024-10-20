class Solution {
    long sumOfSeries(long n) {
        // code here
        if(n==0){
            return 0;
        }
        return (long) Math.pow(n,3)+sumOfSeries(n-1);
    }
}
