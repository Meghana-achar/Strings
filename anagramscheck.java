package strings;

import java.util.Arrays;

public class anagramscheck {

	 public static boolean anagramcheck(String a, String b) {
		 if(a.length()==b.length()) {
			 
			 char[] arr1=a.toCharArray();
			 
			 
			 char[] arr2=b.toCharArray();
			 Arrays.sort(arr1);
			 Arrays.sort(arr2);
			 if(Arrays.equals(arr1, arr2)) {
				 return true;
			 }
			 
		 }
		 
		 return false;
		 
	 }
	public static void main(String[] args) {
		String a="triangle";
		String b="integral";
		System.out.println(anagramcheck(a,b));
		System.out.println(anagramcheck("dog","god"));	

	}

}
