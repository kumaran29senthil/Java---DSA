class Solution {
    double fractionalKnapsack(List<Integer> values, List<Integer> weights, int w) {
        int n=values.size();
        Item[] items = new Item[n];
        for(int i=0;i<n;i++)
        {
         items[i]= new Item(values.get(i),weights.get(i));   
        }
        Arrays.sort(items,(a,b)->Double.compare(b.valueByweight,a.valueByweight));
        double maxval=0.0;
        for(Item item:items)
        {
            if(w==0) break;
            if(item.weight<=w)
            {
                maxval+=item.value;
                w-=item.weight;
            }
            else{
                maxval+=item.valueByweight*w;
                w=0;
            }
        }
         return Math.round(maxval*1000000.0)/1000000.0; 
    }
    class Item{
        int value;
        int weight;
        double valueByweight;
        Item(int v,int w)
        {
            this.value=v;
            this.weight=w;
            this.valueByweight=(double) v/w;
        }
    }
}
