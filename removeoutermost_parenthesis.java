package strings;

public class removeoutermost_parenthesis {
	  public static String removeOuterParentheses(String s) {
	        StringBuilder result = new StringBuilder();
	        int counter = 0;

	        for (char ch : s.toCharArray()) {
	            if (ch == '(') {
	                if (counter > 0) {
	                    result.append(ch); // Append if not outermost
	                }
	                counter++;
	            } else if (ch == ')') {
	                counter--;
	                if (counter > 0) {
	                    result.append(ch); // Append if not outermost
	                }
	            }
	        }

	        return result.toString();
	    }

	public static void main(String[] args) {
		String input = "((()))";
        String output = removeOuterParentheses(input);
        System.out.println(output);
		
	

	}

}
