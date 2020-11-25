//Group Anagrams

// Time Complexity : O(N*Klogk) , N--> no of strings in the input array, k--> length of each string
// Space Complexity :  O(NK)
// Did this code successfully run on Leetcode : No
// Any problem you faced while coding this : No

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagrams{
	
    public List<List<String>> groupAnagrams(String[] strs) {

        /*  */
    	
    	 HashMap<String, List> map = new HashMap<String, List>();
     	
     	for(int i=0;i<strs.length;i++) {   		
     		
            String s = strs[i];
     		char[] ch = s.toCharArray();
             
             Arrays.sort(ch);
     		
     		String key = String.valueOf(ch);
     		
     		if(!map.containsKey(key)) {
     			map.put(key, new ArrayList());
             }
     		map.get(key).add(s);
     	}
         return new ArrayList(map.values());
    }

	public static void main(String[] args) {
		
		Anagrams ob = new Anagrams();
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		
		System.out.println(ob.groupAnagrams(strs));
			
	}
}