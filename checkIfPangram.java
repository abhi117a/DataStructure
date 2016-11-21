package CTC_2;

public class checkIfPangram {

	public void checkPangram(String a){
		a.toLowerCase();
		int CHAR[] = new int [26];
		for(int i=0;i<a.length();i++){
			char x =a.charAt(i);
			if(x >= 97 && x <= 122 ){
			CHAR[x-97]++;
			}
		}
		for(int i: CHAR){
		if(i ==0){
			System.out.println("Not a panagram");
			return;
		}
		}
		System.out.println("Panagram it is");
	}
	
	public static void main(String[] args) {
		checkIfPangram cp = new checkIfPangram();
		cp.checkPangram("abcdefghijklm 12313nopqrstuvwxyz");

	}

}
