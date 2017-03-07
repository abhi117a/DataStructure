package CTC_2;

public class setOfStacks {

	int stk1[] = new int[5];
	int stk2[] = new int[5];
	int pointer1 = -1;
	int pointer2 = -1;
	public void push(int data){
		if(pointer1<4){
			System.out.println("inserting in stack1");
			stk1[++pointer1]  =data;
		}
		else {
		 if(pointer1 == 4 & pointer2 == -1){
			 System.out.println("inserting in stack2 and initializing");
			stk2[++pointer2] = data;
		}
		 else if(pointer2 <4){
			 System.out.println("inserting in stack2");
			 stk2[++pointer2] = data;
		 }
		 else {
			 System.out.println("All stacks are full");
			 return;
		 }
		}
	}
	public void pop(){
		if(pointer2 >-1){
			System.out.println("RemovingfromStack2");
			System.out.println(stk2[pointer2--]);
			return;
		}
		else if(pointer1 >-1){
			System.out.println("RemovingfromStack1");
			System.out.println(stk1[pointer1--]);
			return;
		}
	}
	
	
	
	public static void main(String[] args) {
		setOfStacks sos = new setOfStacks();
		sos.push(1);
		sos.push(2);
		sos.push(3);
		sos.push(4);
		sos.push(5);
		sos.push(6);
		sos.push(7);
		sos.push(8);
		sos.push(9);
		sos.push(10);
		sos.push(10);
		sos.pop();
		sos.pop();
		sos.pop();
		sos.pop();
		sos.pop();
		sos.pop();
		sos.pop();
		sos.pop();

	}

}
