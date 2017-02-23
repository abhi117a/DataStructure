package CTC_2;

public class checkPalindrome {

	public void checkPalin(String str){
		if(str.length()%2==0){
			System.out.println("String cannot be a palindrome");
			return;
		}
		str.toLowerCase();
		char x[] = str.toCharArray();
		int alpha[] = new int[26];
		for(int i=0;i<x.length;i++){
			int j = x[i]-97;
			alpha[j]++;
		}
		int k=0;
		for(int i=0;i<alpha.length;i++){
			if(k>1){
				System.out.println("String is not a plaindrome");
				return;
			}
			else if(alpha[i]%2!=0){
				k++;
			}
		}
		System.out.println("Palindrome");
		
	}
	
	public static void main(String[] args) {
		checkPalindrome cp = new checkPalindrome();
		cp.checkPalin("iiiiikkkkk");

	}

}
