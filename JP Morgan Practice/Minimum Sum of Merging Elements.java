import java.util.*;
public class MinMergeCost{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int [n];
    for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
    System.out.println(minMergeCost(arr));
    sc.close();
  }
  public static int minMergeCost(int [] arr){
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for(int num:arr) pq.add(num);
    int cost=0;
    while(pq.size()>1)
      {
        int first = pq.poll(),second=pq.poll();
        cost+=first+second;
        pq.add(first+second);
      }
    return cost;
  }
}
