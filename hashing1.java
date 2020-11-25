//Program to find given two strings are isomorphic or not

// Time Complexity : O(N)
// Space Complexity :  O(1)
// Did this code successfully run on Leetcode : No
// Any problem you faced while coding this : No


import java.util.HashMap;

public class Isomorphic{
	
	public boolean isIsomorphic(String s, String t) {

        /*
        * Checking whether length of both strings are equal or not 
        */
		if(s.length() == 0 || t.length()==0) {
			return false;
		}
		
		if(s.length() != t.length()) {
			return false;
		}

        /*initializing HashMap datastructure */
		
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		
		for(int i=0;i<s.length();i++) {
			char sChar = s.charAt(i);
			char tChar = t.charAt(i);

            /* checking whether map contains key, if it contains then we check whether its value is same as second value (tChar) */
			
			if(map.containsKey(sChar)) {
				if(map.get(sChar) != tChar) {
					return false;
				}
			}else if(map.values().contains(tChar)) {               
				return false;
			}else {
				map.put(sChar, tChar);                           
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Isomorphic ob = new Isomorphic();
		
		String s = "egg", t = "add";
		
		System.out.println(ob.isIsomorphic(s,t));
		
	}
}

/* SECOND APPROACH using two hashmaps

public class Isomorphic{
	
	public boolean isIsomorphic(String s, String t) {

       
		if(s.length() == 0 || t.length()==0) {
			return false;
		}
		
		if(s.length() != t.length()) {
			return false;
		}
		
		HashMap<Character, Character> sMap = new HashMap<Character, Character>();
        HashMap<Character, Character> tMap = new HashMap<Character, Character>();
		
		for(int i=0;i<s.length();i++) {
            for(int j=0;j<t.length();j++){
                char sChar = s.charAt(i);
     			char tChar = t.charAt(i);
               
     			
     			if(sMap.containsKey(sChar)) {
     				if(sMap.get(sChar) != tChar) {
     					return false;
     				}
     			}
     			else {
     				sMap.put(sChar, tChar);                           
     			}

                if(tMap.containsKey(tChar)) {
     				if(tMap.get(tChar) != sChar) {
     					return false;
     				}
     			}
     			else {
     				sMap.put(tChar, sChar);                           
     			}
		    }
        }			
		return true;
	}
	public static void main(String[] args) {
		Isomorphic ob = new Isomorphic();
		
		String s = "egg", t = "add";
		
		System.out.println(ob.isIsomorphic(s,t));
		
	}
}
*/
