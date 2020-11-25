//Word Pattern

// Time Complexity : O(N), N-> number of words in String s
// Space Complexity :  O(M), M -> number of unique words in string s
// Did this code successfully run on Leetcode : No
// Any problem you faced while coding this : No


public class WordPattern{
	
    public boolean wordPattern(String pattern, String s) {
        
    	/*Maintaining two hashmaps for char to word mapping and word to char mapping*/
    	HashMap<Character, String> charMap= new HashMap<Character, String>();
        HashMap<String, Character> stringMap= new HashMap<String, Character>();
        
        char[] ch = pattern.toCharArray();
        String[] strs = s.split(" ");       
          
        /*checking whether length of pattern and string are same*/
        if(ch.length != strs.length) {
        	return false;
        }
        
        for(int i=0;i<ch.length;i++){
            char key = ch[i];
            String value = strs[i];
            /*if the char-map does not contain the char, then check whether the value is already in the string-map, if not add it to both char-map and string-map*/
          if(!charMap.containsKey(key))
          {            	
                if(stringMap.containsKey(value)) 
                {
                	return false;
                }
                else {
                	charMap.put(key, value);
                    stringMap.put(value, key);
                }
           }
          else {            	  
                  if(!charMap.get(key).equals(value)) 
                  {
                     return false;  
                  }
            }
        }
        return true;
    }
	public static void main(String[] args) {
		WordPattern obj = new WordPattern();
		String pattern = "abba";
		String s = "dog cat cat dog";
		
		System.out.println(obj.wordPattern(pattern, s));
		
	}
}