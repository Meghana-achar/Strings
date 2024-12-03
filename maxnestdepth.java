package strings;

public class maxnestdepth {
        
	public static int maxdepth(String s)
	{
		int depth=0,open=0;
		for(char c: s.toCharArray()) {
			if(c=='(') {
				open++;
			}
			 if(c==')') {
				open--;
			}
		
			depth=Math.max(depth, open);
			}
		 if(open!=0) {
			System.out.println("invalid");
			return -1;
		}
		   return depth;
		}
	 
	public static void main(String[] args) {
	
      String s="(()";
      System.out.println(maxdepth(s));
	}

}
