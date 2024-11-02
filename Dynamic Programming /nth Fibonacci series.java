class Solution{
  private static HashMap<Integer,Integer>memo=new HashMap<>();
  public static int fib(int n)
  {
    if(n<=1)
      return n;
    if(memo.containsKey(n)) 
       return memo.get(n);
    int ans = fib(n-1)+fib(n-2);
    memo.put(n,ans);
    return ans;
  }
}
