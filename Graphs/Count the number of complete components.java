class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int [] e:edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        int [] visited = new int[n];
        int completeComponentsCount = 0;
        for(int i=0;i<n;i++){
            if(visited[i]==0){
                int vertexCount = 0;
                int edgeCount = 0;

                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                visited[i]=1;

                while(!q.isEmpty()){
                    int node = q.poll();
                    vertexCount++;
                    edgeCount += adj.get(node).size();
                    for(int nbr:adj.get(node)){
                        if(visited[nbr]==0){
                            visited[nbr]=1;
                            q.add(nbr);
                        }
                    }
                }
                edgeCount /= 2;
                if(edgeCount == (vertexCount *(vertexCount - 1))/2){
                    completeComponentsCount++;
                }
            }
        }
        return completeComponentsCount;
    }
}
