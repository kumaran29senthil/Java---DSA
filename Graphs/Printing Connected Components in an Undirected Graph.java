class Solution {
    public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        // code here
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    for(int i = 0; i < V;i++){
      adj.add(new ArrayList<>());
    }
    for(int [] e:edges){
      adj.get(e[0]).add(e[1]);
      adj.get(e[1]).add(e[0]);
    }
    boolean[] visited = new boolean[V];
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    for(int i = 0; i < V; i++){
      if(!visited[i]){
        ArrayList<Integer> currentComponent = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        visited[i]=true;
        while(!q.isEmpty()){
          int node = q.poll();
          currentComponent.add(node);
          for(int nbr:adj.get(node)){
            if(!visited[nbr]){
              visited[nbr]=true;
              q.add(nbr);
            }
          }
        }
        result.add(currentComponent);
      }
    }
    return result;
  }
}
