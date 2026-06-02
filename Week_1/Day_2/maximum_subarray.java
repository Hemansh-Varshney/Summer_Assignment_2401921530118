class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int sum=nums[0];
        int maxsum=nums[0];
        for(int i=1;i<n;i++)
        {
            sum=Math.max(sum+nums[i],nums[i]);
            maxsum=Math.max(sum,maxsum);
        }
        return maxsum;
        
    }
}
