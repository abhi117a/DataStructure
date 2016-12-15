package CTC_2;

import java.util.Arrays;

public class Substring {

	private boolean substringg(String s1, String s2){
		if(s1.isEmpty() && s2.isEmpty()){
			return false;
		}
		else if(s1.length()!= s2.length()){
			return false;
		}
			char []s11 = s1.toCharArray();
			char []s22 = s2.toCharArray();
			Arrays.sort(s11);
			Arrays.sort(s22);
			for(int i=0;i<s11.length;i++){
				if(s11[i]!=s22[i]){
					return false;
				}
			}
			return true;
			
	}
	
	public static void main(String[] args) {
		Substring s	 = new Substring();
		System.out.println(s.substringg("water", "tewa"));

	}

}
