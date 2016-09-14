package CTC_2;

import java.util.Arrays;

public class UniqueString1_1 {

	public void chckString(String testValue){ //It checks Unique String i.e. if a charater is been repeated in a string or not
		char [] temp = testValue.toCharArray();
		boolean flag= false;
		Arrays.sort(temp);
		for(int i=0;i<temp.length-1;i++){
			if(temp[i]==temp[i+1]){
				flag=true;
				break;
			}
			else{
				flag=false;
			}
		}
		if(flag==true){
			System.out.println("Not a unique String");
		}
		else{
			System.out.println("Unique String");
		}
		
	}
	
	public void permutString(String mainString ,String testValue){ //Analyses that if a String 2 is a permutation of String 1
		boolean flag=false;
		if(mainString.length()!= testValue.length()){
			flag = false;
		}
		else{
		char mainArray[] = mainString.toCharArray();
		Arrays.sort(mainArray);
		char testArray [] = testValue.toCharArray();
		Arrays.sort(testArray);
		for(int i=0 ; i<mainArray.length;i++ ){
			if (mainArray[i]!=testArray[i]){
				flag = false;
				break;
			}
			else{
				flag=true;
			}
		}
	}
		if(flag==true){
			System.out.println("String 2 is permutation of String 1");
		}
		else {
			System.out.println("No Permutation");
		}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueString1_1 us = new UniqueString1_1();
		//us.chckString("Helo");
		us.permutString("ABC", "BCK");

	}

}
