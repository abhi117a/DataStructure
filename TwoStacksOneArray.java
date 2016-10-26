package CTC_2;

public class TwoStacksOneArray {

	int arr[] = new int[10];
	int top1 =-1;
	int CAPACITY1 = 5;
	int CAPACITY2 = 5;
	int top2 = arr.length;
	public void push1(int Val){
		if(top1 +1 == CAPACITY1){
			System.out.println("Stack 1 is full");
		}
		else {
			arr[++top1] = Val;
		}			
	}
	@SuppressWarnings("null")
	public int pop1(){
		if(top1 <0){
			System.out.println("Stack 1 is empty");
			return (Integer) null;
		}
		else {
			return arr[top1--];
		}
	}
	public void push2(int Val){
		if(top2 == CAPACITY2 ){
			System.out.println("Stack 2 is full");
		}
		else {
			arr[--top2] = Val;
		}
	}
	@SuppressWarnings("null")
	public int pop2(){
		if(top2>arr.length){
			return (Integer)null;
		}
		else {
			return arr[top2++];
		}
	}
	
	
	public static void main(String[] args) {
		TwoStacksOneArray ts = new TwoStacksOneArray();
		ts.push1(11);
		ts.push1(11);
		ts.push1(11);
		ts.push1(11);
		ts.push1(11);
		ts.push2(22);
		ts.push2(22);ts.push2(22);ts.push2(22);ts.push2(22);

	}

}
