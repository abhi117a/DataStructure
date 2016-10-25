package CTC_2;

public class ParanthesisMatching {

	String str = "[{sahjsh(&asjbkdajdasd]}]";
	int top =-1;
	boolean flag = true;
	char stack[];
	public void checkParanthesis(){
		char arr[] = str.toCharArray();
		stack = new char[arr.length];
		for(int i=0; i< arr.length;i++){
			if(arr[i]=='[' || arr[i]=='(' || arr[i]=='{'){
				push(arr[i]);
			}
			else if( arr[i]== ']'||  arr[i]== ')'||  arr[i]== '}') {
				char temp = pop();
				if(temp == '[' && arr[i]== ']' || temp == '(' && arr[i]== ')' || temp == '{' && arr[i]== '}'  ){
					continue;
				}
				else if(temp == '~'){
					System.out.println("Opening Paranthesis missing");
					flag = false;
					break;	
				}
				else {
					System.out.println("Paranthesis Did not match");
					flag = false;
					break;
				}
			}
		}
		if(flag==true){
		System.out.println("Paranthesis Matched");
	}
		}
	public void push(char val){
		stack[++top] = val;
	}
	public char pop(){
		if(top <0){
			//System.exit(1);
			return '~';
		}
		else
		return stack[top--];
	}
	
	public static void main(String[] args) {
		ParanthesisMatching pm = new ParanthesisMatching();
		pm.checkParanthesis();

	}

}
