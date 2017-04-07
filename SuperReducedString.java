package CTC_2;

public class SuperReducedString {

	public void calc(){
		//String str = "aaabccddd";
		StringBuilder str = new StringBuilder("aaabccddd");
		int i=0;
		while(i+1 < str.length()){
			if(str.charAt(i)==str.charAt(i+1)){
				str = str.delete(i, i+2);
				i =0;
			}
			else {
				i++;
			}
		}
		
		
		System.out.println(str);
	}
	
	
	
	
	public static void main(String[] args) {
		SuperReducedString srs = new SuperReducedString();
		srs.calc();

	}

}
