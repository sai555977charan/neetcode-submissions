class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
HashMap<String,List<String>> map= new HashMap<>();
   List<List<String>> values=new ArrayList<>();

for(int i=0;i<strs.length;i++)
{
    char[] chars = strs[i].toCharArray();
    Arrays.sort(chars);
    String str = new String(chars);

    List<String> addValue=new ArrayList<>();

 

    if(map.containsKey(str)){

        map.computeIfAbsent(str, k -> new ArrayList<>()).add(strs[i]);

    }
else
{  

    addValue.add(strs[i]);
    map.put(str,addValue);
}
}

for (List<String> list : map.values()) {
   
        values.add(list);
    }
return values;
}
}
