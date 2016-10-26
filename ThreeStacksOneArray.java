package CTC_2;

public class ThreeStacksOneArray {

	int arr[] = new int [15];
	int top1 =-1;
	int top3 = arr.length;
	int top2 = 4;
	int SIZE1 = 5;
	int SIZE2 = 10;
	int SIZE3 = 10;
	
	public void push1(int Val){
		if(top1+1 == SIZE1){
			System.out.println("Stack 1 is full");
		}
		else {
			arr[++top1] = Val;
		}
	}
	public void push2(int Val){
		if(top2+1 == SIZE2){
			System.out.println("Stack 2 is full");
		}
		else {
			arr[++top2] = Val;
		}
	}
	public void push3(int Val){
		if(top3 == SIZE3){
			System.out.println("Stack 3 is full");
		}
		else {
			arr[--top3] = Val;
		}
	}
	@SuppressWarnings("null")
	public void pop1(){
		if(top1 <0){
			System.out.println("Stack 1 is empty");
		}
		else {
			System.out.println( "Poped from Stack 1: "+arr[top1--]);
		}
	}
	public void pop2(){
		if(top2 < 5 ){
			System.out.println("Stack 2 is empty");
		}
		else {
			System.out.println( "Poped from Stack 2: "+arr[top2--]);
		}
	}
	@SuppressWarnings("null")
	public void pop3(){
		if(top3 > arr.length-1){
			System.out.println("Stack 3 is empty");
			
		}
		else {
			System.out.println( "Poped from Stack 3: "+arr[top3++]);
		}
	}
	
	
	
	public static void main(String[] args) {
		ThreeStacksOneArray ts1 = new ThreeStacksOneArray();
		ts1.push1(11);
		ts1.push2(11);
		ts1.push3(11);
		ts1.push1(11);
		ts1.push2(11);
		ts1.push3(11);
		ts1.push1(11);
		ts1.push2(11);
		ts1.push3(11);
		ts1.push1(11);
		ts1.push2(11);
		ts1.push3(11);
		ts1.push1(11);
		ts1.push2(11);
		ts1.push3(11);
		ts1.pop1();
		ts1.pop2();
		ts1.pop3();
		ts1.pop1();
		ts1.pop2();
		ts1.pop3();
		ts1.pop1();
		ts1.pop2();
		ts1.pop3();
		ts1.pop1();
		ts1.pop2();
		ts1.pop3();
		ts1.pop1();
		ts1.pop2();
		ts1.pop3();
		ts1.pop3();
		ts1.pop3();
	}

}
