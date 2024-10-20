class Solution {

    void printGfg(int N) {
        // code here name=GFG
        String str="GFG";
        if(N<=0) return ;
        System.out.print(str + " ");
        N--;
        printGfg(N);
    } 
}
