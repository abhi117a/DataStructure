package CTC_2;

public class camelCase {

	public void countCamel(){
		String str ="saveChangesInTheEditor";
		int count =1;
		for(int i=0;i<str.length();i++){
			int temp = str.charAt(i); 
			if(temp >=65 && temp <= 90){
				count++;
			}
		}
		System.out.println(count);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		camelCase cc = new camelCase();
		cc.countCamel();

	}

}
