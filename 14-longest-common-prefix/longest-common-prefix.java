class Solution {
    public String longestCommonPrefix(String[] strs) {
       StringBuilder st = new StringBuilder();
       Arrays.sort(strs);
       
       char[] first = strs[0].toCharArray();
       char[] second = strs[strs.length-1].toCharArray();

       for(int i=0; i<first.length;i++){
             if(first[i]==second[i]){
             st.append(first[i]);
         }
        else{
            break;
        }
        }

       return st.toString();
    }
}