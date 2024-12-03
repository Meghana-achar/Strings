package strings;
import java.util.Arrays;

public class sortbyfreq {
	public static String sbf(String s) {
		//count freq of each char
		int[] frequency=new int[256];
		
		//count freq of each char in string
		for(char c:s.toCharArray()) {
			frequency[c]++;
		}
		
		//create a character array  to store characters in order of freq
		StringBuilder result=new StringBuilder();
		
		//sort and append char by freq
		
		//start from high freq and build string
	      for(int count=s.length();count>0;count--) {
	    	  
	    	  //for each freq , find all char with its freq
	    	  for(char c=0;c<256;c++) {
	    		  if(frequency[c]==count) {
	    			  
	    			  //append the char 'count' times
	    			  for(int i=0;i<count;i++) {
	    				  result.append((char) c);
	    			  }
	    			  frequency[c]=0; //after appending , set the frequency to 0 to avoid duplicates
	    		  }
	    	  }
	      }
	      return result.toString();
	}

	
	public static void main(String[] args) {
		String in="tree";
		String res=sbf(in);
		System.out.println(res);
		
	

	}

}
