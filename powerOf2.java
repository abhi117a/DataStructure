package CTC_2;

public class powerOf2 {

	int powerOF2(int n){
		if(n==0){
			System.out.println(0);
			return 0;
		}
		else if (n==1){
		System.out.println(1);
		return 1;	
		}
		else {
			int prev = powerOF2(n/2);
			int curr = prev*2;
			System.out.println(curr);
			return curr;
		}
		
	}
	
	
	public static void main(String[] args) {
		powerOf2 p2 = new powerOf2();
		p2.powerOF2(50);

	}

}
