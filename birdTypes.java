package CTC_2;

import java.util.Arrays;

public class birdTypes {
	
	

	    public int solve(int[] types){
	       
	    	
	    	int [] placer = new int[6];
	        for(int i=0;i <types.length;i++){
	            placer[types[i]]++;
	        }
	        int k = 0;
	        	for(int i=0;i<placer.length;i++){
	        		if(k < placer[i]){
	        			k = i;
	        		}
	        	}
	        return(k);
	    }
	
	
	
	public static void main(String[] args) {
		birdTypes bt = new birdTypes();
		int[] types = {1 ,4 ,4 ,4, 5, 3};
		System.out.println(bt.solve(types));

	}

}
