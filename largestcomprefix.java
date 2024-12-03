package strings;

import java.util.Arrays;

public class largestcomprefix {
    public static String lcp(String[] s) {
    	if(s==null || s.length==0) {
    		return "-1";
    	}
    	Arrays.sort(s);
    	String f=s[0];
    	String l=s[s.length-1];
    	int min=Math.min(f.length(),l.length());
    	int i=0;
    	while(i<min && f.charAt(i)==l.charAt(i)) {
    		i++;
    	}
    	if(i==0) {
    		return "-1";
    	}
    	return f.substring(0,i);
    	
    }
	public static void main(String[] args) {
	
      String[] a= {"mango","man","mangolia","many"}
      ;
      String ans=lcp(a);
      System.out.println(ans);
	}

}
