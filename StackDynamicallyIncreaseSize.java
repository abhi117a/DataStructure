package CTC_2;

public class StackDynamicallyIncreaseSize {

	int stk[] = new int[5];
	int size = stk.length;
	int pointer = -1;
	private void pushh(int data){
		if(pointer < size-1){
			stk[++pointer] = data;
		}
		else {
			stk = increaseStack(stk);
			stk[++pointer] = data;
		}
	}
	
	private int[] increaseStack(int[] stk2) {
		size = size*2;
		int st[] = new int[size];
		for(int i=0;i<stk2.length;i++){
			st[i] = stk2[i];
		}
		return st;
	}
public void printStack(){
	for(int val: stk){
		System.out.println(val);
	}
}
	public static void main(String[] args) {
		StackDynamicallyIncreaseSize sd  = new StackDynamicallyIncreaseSize();
		sd.pushh(1);
		sd.pushh(2);
		sd.pushh(3);
		sd.pushh(4);
		sd.pushh(5);
		sd.pushh(6);
		sd.pushh(7);
		sd.pushh(8);
		sd.pushh(9);
		sd.pushh(10);
		sd.pushh(11);
		sd.printStack();

	}

}
