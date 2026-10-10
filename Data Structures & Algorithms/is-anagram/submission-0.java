class Solution {
    public boolean isAnagram(String s, String t) {

    if(s.length()!=t.length())
    return false;

    HashMap<Character,Integer> map= new HashMap<>();

    for(int i=0;i<s.length();i++){

        if(map.containsKey(s.charAt(i)))
        map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        else
        map.put(s.charAt(i),1);
    }

    for(int j=0;j<t.length();j++){
        if(map.containsKey(t.charAt(j)))
    map.put(t.charAt(j), map.getOrDefault(t.charAt(j), 0) - 1);
    }


for (Map.Entry<Character, Integer> entry : map.entrySet()) {
   if(entry.getValue()!=0)
   return false;
}
     
return true;

    }
}
