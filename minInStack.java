package CTC_2;

public class minInStack {
	int mainStack [];
	int minStack[];
	int top =-1, topM =-1;
	int size;
	public void createStack(int size){
		this.size = size;
		mainStack = new int[size];
		minStack = new int [size];
	}
	public void push(int val){
		if(top+1 == size){
			System.out.println("Stack is full");
		}
		else {
			mainStack[++top] = val;
			if(topM == -1){
				minStack[++topM] = val;
			}
			else if(minStack[topM] >= val){
				minStack[++topM] = val;
			}
			else {
				minStack[++topM] = minStack[topM];
			}
		}
	}
	public void pop(){
		int temp = minStack[0];
	if(top <0){
		System.out.println("Stack is empty");
		//
	}
	else {
		mainStack[top--] = -1;
		minStack[topM--] = -1;
		//System.out.println("Min Value is: "+minStack[topM]);
	}
	}
	public void findMin(){
		int temp = minStack[0];
		if(top <0){
			System.out.println("Min Value after stack is empty: "+temp );
		}else{
			System.out.println("Minimum Value: " +minStack[topM]);
		}
		
	}
	
	
	public static void main(String[] args) {
		minInStack ms= new minInStack();
		ms.createStack(5);
		ms.push(5);
		ms.push(2);
		ms.push(9);
		ms.findMin();

	}

}
