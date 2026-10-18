class Solution {
    public int characterReplacement(String s, int k) {

         Map<Character, Integer> count = new HashMap<>();
    int left = 0, maxFreq = 0, max = 0;

    for (int right = 0; right < s.length(); right++) {
        char c = s.charAt(right);
        count.put(c, count.getOrDefault(c, 0) + 1);
        maxFreq = Math.max(maxFreq, count.get(c));

        if ((right - left + 1) <= maxFreq + k) {
            // valid: record it
            max = Math.max(max, right - left + 1);
        } else {
            // invalid: slide the window forward by one
            char l = s.charAt(left);
            count.put(l, count.get(l) - 1);
            left++;
        }
    }
    return max;

  
       
        }

      
        
    }

