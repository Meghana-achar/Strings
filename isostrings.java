package strings;

import java.util.HashMap;

public class isostrings {
       public static boolean iso(String s, String t) {
    	   HashMap<Character,Character> hm=new HashMap<Character,Character>();
    	   for(int i=0;i<s.length();i++) {
    		   // If the character in s (s.charAt(i)) is already mapped
    		   if(hm.containsKey(s.charAt(i))) {
    			   // Check if the existing mapping matches the current character in t (t.charAt(i))
    			  if(!hm.get(s.charAt(i)).equals(t.charAt(i))) {
    				  return false;
    			  }
    		   }
    			  else {
    				  // Check if the current character in t is already mapped to any character from s
    				  if(hm.containsValue(t.charAt(i))) {
    			 
    				  return false;
    				  }	
    				  // Otherwise, create the new mapping from s.charAt(i) to t.charAt(i)
    				  hm.put(s.charAt(i), t.charAt(i)); 
    			  }		 
    		   
    	   }
    	   return true;  
       }
	public static void main(String[] args) {
		
       String s="abb";
       String t="cdd";
       System.out.print(iso(s,t));
	}

}
