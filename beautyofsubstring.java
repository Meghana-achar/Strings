package strings;
import java.util.Arrays;


public class beautyofsubstring {
	    
public static int getmin(int[] freq) {
	int min=Integer.MAX_VALUE;
	for(int i=0;i<26;i++) {
		if(freq[i]!=0) {
			min=Math.min(min, freq[i]);
		}
	}
	return min;
	
}

public static int getmax(int[] freq) {
	int max=0;
	for(int i=0;i<26;i++) {
		max=Math.max(max, freq[i]);
	}
	return max;
}

public static int beautysum(String s) {
	int sum=0;
	for(int i=0;i<s.length();i++) {
		int[] freq=new int[26];
		for(int j=i;j<s.length();j++) {
			freq[s.charAt(j)-'a']++;
			int beauty=getmax(freq)-getmin(freq);
			sum+=beauty;
			
		}
	}
	return sum;
}
		
	    public static void main(String[] args) {

	        String s = "aabcb";
	        System.out.println(beautysum(s));
	    }
	}
