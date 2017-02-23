package CTC_2;

public class string20replace {

	public void string20(String str, int strLen){
		char x[] = str.toCharArray();
		char fin[] = new char[x.length];
		int j = fin.length-1;
		
		
		for(int i=strLen-1;i>=0;i--){
			
			if(x[i]!=' '){
				fin[j] = x[i];
				j--;
			}
			else if(x[i]==' ') {
				fin[j] = '0';
				j--;
				fin[j] = '2';
				j--;
				fin[j] = '%';
				j--;
			}
		}
		for(char p:fin){
			System.out.print(p);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		string20replace s2 = new string20replace();
		s2.string20("Mr John Smith    ", 13);

	}

}
