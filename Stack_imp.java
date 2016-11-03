package CTC_2;

public class Stack_imp {

	int top;
	int [] stack;
	int capacity;
	
	public void create(int capacity){
		this.capacity = capacity;
		top=-1;
		stack = new int[capacity];
		for (int i=0;i<capacity;i++){
			stack[i] = -1;
		}
	}
	public void push(int val){
		if(top+1 == capacity){
			System.out.println("Stack is full");
		}
		else {
			stack[++top] = val;
		}
	}
	public void pop(){
		if(top <0){
			System.out.println("Stack is empty");
		}
		else{
			stack[top]=-1;
			System.out.println("Element Poped");
			top--;
		}
	}
	public void prnt(){
		for(int i=top; i>=0; i--){
			System.out.println(stack[i]);
		}
	}
	
	public void topStack(){
		System.out.println("Top of Stack: "+ stack[top]);
	}
	public void sizeStack(){
		System.out.println("Size of stack: "+ top+1);
	}
	
	
	public static void main(String[] args) {
		Stack_imp st = new Stack_imp();
		st.create(5);
		st.push(10);
		st.push(11);
		st.push(12);
		st.push(13);
		st.push(14);
		st.prnt();
		//st.pop();
		//st.pop();
		st.pop();
		st.pop();
		st.pop();
		System.out.println(" AFTER POP      ");
		st.prnt();
	}

}
