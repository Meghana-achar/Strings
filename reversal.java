package strings;

public class reversal {
	 public static String re(String s) {
		 
		 String rev="";
	
		
		 for(int i=0;i<s.length();i++) {
			 char c=s.charAt(i);
			 rev=c+rev;	 
			 
		 }
			//check palindrome 
			 
		       
			if(rev.equals(s)) {
				System.out.println("palindrome");
			}
			else
			{
				System.out.println("not a palindrome");
			}
		 
		 return rev;
}

	public static void main(String[] args) {
	   
		String ans=re("malayalam");
		System.out.println(ans);
	

	}

}
