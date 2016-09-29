package CTC_2;

public class LinkedList {
	Node1 head;
	public void addATBeginning(int data){
		
		if(head==null){
			head  = new Node1();
			head.data = data;
		}
		else{
			Node1 p = new Node1();
			p.data = data;
			p.next = head;
			head = p;
		}
	}
	
	public void addAtEnd(int data){
		
		if (head==null){
			head = new Node1();
			head.data = data;
		}
		
		else {
			Node1 p = head;
			while(p.next!=null){
			p = p.next;
			}
			p.next = new Node1();
			p.next.data = data;
			
		}
	}
	
	public void addatKnownLocation(int Loc,int data){
		int count = Loc;
		if(count==1){
			Node1 p = new Node1() ;
			p.data = data;
			p.next = head;
			head = p;
		}
		else if(count>1){
			Node1 p = head;
			while(p.next!=null&&count>2){
				p = p.next;
				count--;
			}
			Node1 temp = p.next;
			p.next = new Node1();
			p.next.data = data;
			p.next.next = temp;
			
		}
	}
	public void printNodes(){
		Node1 p =head;
		while(p!=null){
		System.out.println(p.data);
		p = p.next;
		}
	}
	
	public void removeAtBegining(){
		Node1 p = head;
		 head = p.next;
	}
	public void removeAtEnd(){
		Node1 p = head;
		while(p.next.next!=null){
			p = p.next;
		}
		p.next=null;
	}
	public void removeAtLocation(int Loc){
		int count = Loc;
		
		if(count==1){
			Node1 p ;
			 p = head;
			head =p.next;
		}
		else if(count >1){
			Node1 p =head;
		while(p.next!=null && count > 3){
			p = p.next;
			count--;
		}
		p.next = p.next.next;
		}
		
		
	}
	
	public static void main(String[] args) {
		LinkedList ls = new LinkedList();
		ls.addATBeginning(1);
		ls.addATBeginning(2);
		ls.addATBeginning(3);
		ls.addATBeginning(4);
		ls.addATBeginning(5);
		ls.addATBeginning(6);
//		ls.addAtEnd(1);
//		ls.addAtEnd(2);
//		ls.addAtEnd(3);
		//ls.addatKnownLocation(1, 7);
		ls.removeAtLocation(1);
		//ls.removeAtEnd();
		//ls.removeAtBegining();
		ls.printNodes();
	}

}
