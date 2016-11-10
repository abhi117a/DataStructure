package CTC_2;

import java.util.HashMap;
import java.util.Map;

public class RansomeNoteString {

	public void checkIf(String magazine, String ransom){
		Map<String, Integer> hm = new HashMap<String, Integer>();
		
	String[] mag = magazine.split(" ");
	String [] rans = ransom.split(" ");
//	for(String j: mag){
//		System.out.println(j);
//	}
		for(int i=0;i<mag.length;i++){
			if(hm.containsKey(mag[i])){
			int temp = hm.get(mag[i]);
				hm.put(mag[i], temp++);
			}
			else {
				hm.put(mag[i], 1);
			}
		}
		for(int i=0;i<rans.length;i++){
			if(hm.containsKey(rans[i])){
				int temp = hm.get(rans[i]);
				if(temp <1){
					System.out.println("Magazine is out of words");
					return;
				}
				temp--;
				hm.put(rans[i], temp);
			}
			else {
				System.out.println("Ransom message cannot be created as no word is found in magazine");
				return;
			}
		}
		System.out.println("Ransom message created");
		
		
	}
	
	public static void main(String[] args) {
		RansomeNoteString rs = new RansomeNoteString();
		rs.checkIf("give me one grand today night", "give one one grand today");

	}

}
