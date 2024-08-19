class Solution {
    static int numSubarray(int[] nums, int goal){
        int left = 0;
        int right = 0;
        int count = 0;
        int sum = 0;
        while(right<nums.length){
            sum = sum + nums[right];
            while(sum>goal && left<=right){
                sum = sum - nums[left];
                left++;
            }
            count = count + (right-left+1);
            right++;
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        if(goal<0){
            return 0;
        }
        int ans1 = numSubarray(nums,goal);
        int ans2 = numSubarray(nums, goal-1);

        return ans1-ans2;
    }
}