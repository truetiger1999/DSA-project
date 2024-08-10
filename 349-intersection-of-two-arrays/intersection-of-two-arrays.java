class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> al = new ArrayList<>();
        int i=0 , j = 0;
         while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums2[j]<nums1[i]){
                j++;
            }else{
                if(al.size()==0 || al.get(al.size()-1)!=nums1[i]){
                    al.add(nums1[i]);
                }
                i++;
                j++;
            }
        }

        int arr[] = new int[al.size()];
        for(int k=0; k<arr.length;k++){
            arr[k] = al.get(k);
        }

        return arr;
    }
}