// Method 1 TC: O(n^2) , SC: O(n)
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int a = 0 ;
        HashSet<Integer> hset = new HashSet<>();
        int n = grid.length * grid[0].length;
        int actualSum = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int val = grid[i][j];
                actualSum += val;
                if(!hset.add(val)){
                    a = val;
                }
            }
        }
        int expectedSum = n*(n+1)/2;
        int b = expectedSum - actualSum + a ;
        return new int[] {a,b};
    }
}
//Method 2 Time Complexity: O(n^2)	Space Complexity:	O(1)
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long actualSum = 0;
        long actualSumSq = 0;
        long n = (long) grid.length * grid[0].length;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                long val = grid[i][j];
                actualSum += val;
                actualSumSq += val*val;
            }
        }
        long expectedSum = n*(n+1)/2;
        long expectedSumSq = n*(n+1)*(2*n+1)/6;

        long diff1 = actualSum - expectedSum;
        long diff2 = actualSumSq - expectedSumSq;

        long sumAB = diff2 / diff1;
        int a = (int) (diff1 + sumAB) / 2;
        int b = (int) (sumAB - a);
        
        return new int [] {a,b};
    }
}
