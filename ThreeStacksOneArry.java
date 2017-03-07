package CTC_2;

public class ThreeStacksOneArry {

	int stackks [] = new int[15];
	int size = 5;
	int pointer1 = -1;
	int pointer2 = 4;
	int pointer3 = 10;
	public void pushElement(int data, int point){
		if(point == 1){
			if(pointer1 < 5){
				stackks[++pointer1] = data;
			}
			else {
				System.out.println("Stack1 is full");
				return ;
			}
		}
		else if(point == 2){
			if(pointer2 <10){
				stackks[++pointer2] = data;
			}
			else {
				System.out.println("Stack 2 is full");
				return;
			}
		}
		else if(point == 3){
			if(pointer3 <15){
				stackks[++pointer3] = data;
			}
			else {
				System.out.println("Stack 3 is full");
				return;
			}
		}
	}
	
	public void pop(int point){
		if(point ==1 && pointer1 > -1){
			int poper = stackks[pointer1--];
			System.out.println(poper);
		}
		else {
			System.out.println("Stack 1 is empty");
			return;
		}
		if(point ==2 && pointer2 > 4){
			int poper = stackks[pointer2--];
			System.out.println(poper);
		}
		else {
			System.out.println("Stack 2 is empty");
			return;
		}if(point ==3 && pointer3 > 9){
			int poper = stackks[pointer3--];
			System.out.println(poper);
		}
		else {
			System.out.println("Stack 3 is empty");
			return;
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
