package CTC_2;

public class countSpaces {

	public void count(String a){
		char A[] = a.toCharArray();
		int count=0;
		for(char x : A){
			if(x== ' '){
				count++;
			}
		}
		System.out.println("COunt is: "+count);
	}
	
	
	public static void main(String[] args) {
		countSpaces cs = new countSpaces();
		cs.count("H e l o $ W ");

	}

}
