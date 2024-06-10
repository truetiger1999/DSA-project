class Solution {
    public int searchInsert(int[] arr, int target) {

        //this is exactly similar to lower bound
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans  = n;
        while(low<=high){
            int mid = (low+(high-low)/2);
            if(arr[mid]>=target){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        return ans;
        
    }
}