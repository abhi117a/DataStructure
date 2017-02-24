package CTC_2;

public class substringCheck {

	substringCheck(String str1,String str2){
		String comb = str2+str2;
		System.out.println( isSubstring(comb,str1));
	}
	private boolean isSubstring(String comb, String str1){
		return(comb.contains(str1));
	}
	public static void main(String[] args) {
		substringCheck sc = new substringCheck("waterbottle", "erbottlewat");

	}

}
