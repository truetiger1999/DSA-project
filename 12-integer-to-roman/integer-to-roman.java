class Solution {
    public String intToRoman(int n) {
        
        int[] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] sym = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        String res = "";

        for(int i=0; i<13;i++){
            if(n==0){
                break;
            }
            int times = n/val[i];
            while(times>0){
                res += sym[i];
                times--;
            }
            n = n%val[i];
        }

        return res;
    }
}