class Solution {
    public boolean checkInclusion(String s1, String s2) {


        Map<Character,Integer> s1map= new HashMap<>();
        Map<Character,Integer> s2map= new HashMap<>();

        int left=0;


        for(int i=0;i<s1.length();i++){
            s1map.put(s1.charAt(i),s1map.getOrDefault(s1.charAt(i),0)+1);
        }


        for(int right=0;right<s2.length();right++){

           s2map.put(s2.charAt(right),s2map.getOrDefault(s2.charAt(right),0)+1);

            if(s1map.equals(s2map)){
                return true;
            }

            

            if(right-left+1==s1.length()){


               

                 s2map.put(s2.charAt(left),s2map.getOrDefault(s2.charAt(left),0)-1); 
 
                 
                 if(s2map.get(s2.charAt(left))==0){
                    
                    s2map.remove(s2.charAt(left));     
                 }
                 left++;
                }

           
            }
                   

           // s2map.put(s2.charAt(right),s2map.getOrDefault(s2.charAt(right),0)+1);
        
        return false;

      
}
}