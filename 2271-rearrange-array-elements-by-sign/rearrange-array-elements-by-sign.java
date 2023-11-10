class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int positive = 0;
        int negative = 1;
        for(int i = 0; i<n;i++){
            if(nums[i]<0){
                ans[negative] = nums[i];
                negative+=2;
            }
            else{
                ans[positive] = nums[i];
                positive+=2;
            }
        }
        return ans;
    }
}