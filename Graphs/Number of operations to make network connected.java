class Solution {
    public int makeConnected(int n, int[][] connections) {
        if(connections.length<n-1){
            return -1;
        }
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n;i++){
            adj.add(new ArrayList<>());
        }
        for(int [] e:connections){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        int [] visited = new int[n];
        int components = 0;
        for(int i = 0; i < n;i++){
            if(visited[i]==0){
                components++;
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                visited[i]=1;
                while(!q.isEmpty()){
                    int node = q.poll();
                    for(int nbr:adj.get(node)){
                        if(visited[nbr]==0){
                            visited[nbr]=1;
                            q.add(nbr);
                        }
                    }
                }
            }
        }
        return components-1;
    }
}
