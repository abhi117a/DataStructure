package CTC_2;

public class stringSpaceReplace {

	public void replaceSpace(){
		String str = "Mr John Smith    "; //Assuming We are given string length and also extra free space to solve the problem
		char test[] = str.toCharArray();
		int count= 16; //Total space provided
		
		for(int i=12;i>0;i--){//String length 12(given)
			
			if(test[i]==' '){
				test[count]='%';
				test[count-1]='0';
				test[count-2]='2';
				count--;
				count--;
				count--;
			}
			else{
				test[count] = test[i];
				count--;
			}
		}
		for (char c : test) {
			System.out.print(c);
}
	}
	
	public static void main(String[] args) {
		stringSpaceReplace ssr = new stringSpaceReplace();
		ssr.replaceSpace();

	}

}
