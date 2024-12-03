package strings;

public class onestringrotationofother {

	 public static boolean sr(String a, String b) {
		 if(a.length()==b.length()) {
			String c=a+a;
			if(c.contains(b)) {
				return true;
			}
			else 
			{
				return false;
			}
			
		 }
		 return true;
	 }
	public static void main(String[] args) {
		String a="abcde";
		String b="bcdea";
		System.out.print(sr(a,b));

	}

}
