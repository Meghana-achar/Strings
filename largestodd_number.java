package strings;

public class largestodd_number {
	public static String largestodd(String s) {
		for (int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)%2!=0) {
				String a=s.substring(0,i+1);
				return a;
				
			}
		}
		return " no odd";
	}

	public static void main(String[] args) {
		
		String b="264";
		String ans=largestodd(b);
		System.out.print(ans);
		

	}

}
