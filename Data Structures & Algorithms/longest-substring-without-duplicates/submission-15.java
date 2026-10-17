class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> nodupes=new HashSet<>();

        int max=0;
        int left=0;

        if(s.length()==1)
        return 1;
       

        for(int right=0;right<s.length();right++){

           if(nodupes.contains(s.charAt(right))){

          
            while(left<right && nodupes.contains(s.charAt(right))){
            nodupes.remove(s.charAt(left));
            left++;
            }
            nodupes.add(s.charAt(left));
           }
           max=Math.max(right-left+1,max);
           nodupes.add(s.charAt(right));

        }



return max;


        
        
    }
}
