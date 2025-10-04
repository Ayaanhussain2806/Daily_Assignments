class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int min=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            min=Math.max(sum,min);
            if(sum<0){
                sum=0;
            }
        }
        return min;
    }
}