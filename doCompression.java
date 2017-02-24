package CTC_2;

import java.util.Hashtable;
import java.util.Set;

public class doCompression {

	public void todoCompression(String str){
		char x[] = str.toCharArray();
		Hashtable<Character,Integer> ht = new Hashtable<Character,Integer>();
		for(int i=0;i<x.length;i++){
			if(ht.containsKey(x[i])){
				int j = ht.get(x[i]);
				ht.put(x[i], j+1);
			}
			else {
				ht.put(x[i], 1);
			}
		}
		StringBuilder compressed = new StringBuilder();
		String fin = "";
		Set<Character> keys = ht.keySet();
		for(char key: keys){
			compressed.append(key);
			compressed.append(ht.get(key));
		}
		System.out.println("Compressed: "+compressed+" length "+compressed.length());
		if(str.length()<= compressed.length()){
			System.out.println(str);
			return;
		}
		else {
			System.out.println(compressed);
			return;
		}
	}
	
	
	public static void main(String[] args) {
		
		doCompression dc = new doCompression();
		dc.todoCompression("AAAABBBBBaaaaabbbbbbbbbbbbbbbbbb");
	}

}
