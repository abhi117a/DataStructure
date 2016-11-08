package CTC_2;

public class kangarooSpeed {

	public void check(){
		int start = 0;
		int speed = 3;
		int start1 = 4;
		int speed1 = 2;
		
		if(start < start1 && speed < speed1){
			System.out.println("Speed cannot match as start and speed are haveing lower value");
			return;
		}
		else if(start > start1 && speed > speed1){
			System.out.println("Speed cannot match as start and speed are haveing lower value");
			return;
		}
		
		int max,min;
		if(speed > speed1){
			max = speed;
			min = speed1;
		}
		else {
			max = speed1;
			min = speed;
		}
		for(int i=1;i<=min;i++){
			int x = max*i;
			if(x%min==0){
				System.out.println("speed will match at: "+x);
				return;
			}
		}
		System.out.println("Cannot match the speed");
		
		
	}
	
	
	
	public static void main(String[] args) {
		kangarooSpeed ks = new kangarooSpeed();
		ks.check();

	}

}
