package strings;

public class dectorom {

	 public static String dtr(int num) {
		 
		 String [] romansymbols= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		 int[] decimalvalues= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		 
		 StringBuilder romanNumeral =new StringBuilder();
		 
		 for(int i=0;i<decimalvalues.length;i++) {
			 while(num>=decimalvalues[i]) {
				 num=num-decimalvalues[i];
				 romanNumeral.append(romansymbols[i]);
				 
			 }
		 }
		 return romanNumeral.toString();
	 }
	public static void main(String[] args) {
		
		int dn=1000;
		String r=dtr(dn);
		System.out.println("decimal"+" "+dn+"->roman:"+r);
	

	}

}
