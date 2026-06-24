import java.util.*;
class Solution{
  public int countComponents(int V, int[][]edges){
    List<List<Integer>> adj = new ArrayList<>();
    for(int i = 0; i < V; i++){
      adj.add(new ArrayList<>());
    }
    for(int [] e : edges){
      adj.get(e[0]).add(e[1]);
      adj.get(e[1]).add(e[0]);
    }
    int [] visited = new int [V];
    int components = 0;
    for(int i = 0; i < V; i++){
      if(visited[i]==0){
        components++;

        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        visited[i] = 1;

      while(!q.isEmpty()){
        int node = q.poll();
        for(int nbr : adj.get(node)){
          if(visited[nbr]==0){
            visited[nbr]=1;
            q.add(nbr);
          }
        }
      }
    }
  }
 return components;
 }
}

public class Main {
    public static void main(String[] args) {
        int V = 5;
        int[][] edges = {{0, 1}, {1, 2}, {3, 4}};

        Solution sol = new Solution();
        System.out.println("Number of Connected Components: " + sol.countComponents(V, edges));
    }
}
          
