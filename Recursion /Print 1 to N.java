
class Solution
{
    
  public void printNos(int N)
    {
        //Your code here
        printNumbers(1,N);
    }
    public void printNumbers(int i,int N){
        if(i>N) return ;
        System.out.print(i + " ");
        i++;
        printNumbers(i,N);
    }
}
