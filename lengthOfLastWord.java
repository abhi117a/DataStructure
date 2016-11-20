package CTC_2;

public class lengthOfLastWord {
String x;
	private void check(String a){
		
		System.out.println(a.substring(1,3));
		for(int i=a.length(); i> 1;i--){
			if(a.substring(i-1, i).equals(" ")){
				 x = a.substring(i,a.length());
				 System.out.println("The last word is: "+x);
				 System.out.println("It's length is: "+x.length());
				return;
			}
		}
	
	}

	
	
	
	public static void main(String[] args) {
		lengthOfLastWord lw = new lengthOfLastWord();
		lw.check("Hello World hii");
	}

}
