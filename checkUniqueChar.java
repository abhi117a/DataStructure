package CTC_2;

import java.util.HashMap;
import java.util.Map;

public class checkUniqueChar {
//Time Complexity O(n) Space O(n)
	public boolean checkUniqueness(String str){
		
		char temp[] = str.toCharArray();
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		for(char t : temp){
			if(hm.containsKey(t)){
				return false;
			}
			else
			{
				hm.put(t, 1);
			}
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		checkUniqueChar cu = new checkUniqueChar();
		System.out.println(cu.checkUniqueness("Hello"));
		

	}

}
