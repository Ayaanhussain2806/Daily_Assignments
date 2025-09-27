class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] indegree=new int[n+1];
        int[] outdegree=new int[n+1];
        for(int[] arr:trust){
            int a=arr[0];
            int b=arr[1];
            indegree[b]++;
            outdegree[a]--;
        }
        for(int i=1;i<=n;i++){
            if(indegree[i]==n-1 && outdegree[i]==0){
                return i;
            }
        }
        return -1;
    }
}