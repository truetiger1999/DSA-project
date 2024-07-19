class Solution {
    public int countDigits(int num) {
        int ans = num;

        int count = 0;
        while(num>0){
            int val = num%10;
            if(ans%val==0){
                count++;
            }
            num = num/10;
        }

        return count;
    }
}