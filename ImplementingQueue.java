package CTC_2;
import java.util.*;
public class ImplementingQueue {
	
	java.util.Stack<Integer> s1 = new java.util.Stack<Integer>();
	java.util.Stack<Integer> s2 = new java.util.Stack<Integer>();
	
	
	public void push(Integer Obj){
		s1.push(Obj);
	}
	public Integer pop(){
		if(s2.empty()){
			if(s1.empty()){
				return null;
			}
		}
		else {
			while(!s1.empty()){
				s2.push(s1.pop());
			}
			 
		}
		return s2.pop();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
