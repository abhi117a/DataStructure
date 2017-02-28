package CTC_2;

public class LinkedLists_Nodes {

	static Nodes head;
	public void addNodeAtTheEnd(int data){
		if(head==null){
			head = new Nodes();
			head.item = data;
		}
		else {
		Nodes p = head;
		while(p.next!=null){
			p=p.next;
		}
		p.next = new Nodes();
		p.next.item = data;
	}
	}
	
	
	public void addAtTheStart(int data){
		if(head==null){
			head = new Nodes();
			head.item = data;
		}
		else {
			Nodes p = new Nodes();
			p.item = data;
			p.next = head;
			head = p;
		}
	}
	
	
	public void printNodes(){
		if(head==null){
			System.out.println("No data");
			return;
		}
		Nodes p = head; 
		while(p!=null){
			System.out.println(p.item);
			p = p.next;
		}
		//System.out.println(p.item);
	}
	
	public void addAtKnownLocation(int data, int k){
		if(head==null & k == 0){
			head = new Nodes();
			head.item = data;
			return;
		}
		else {
			Nodes p = head;
			for(int i=0;i<k-1;i++){
				p = p.next;
			}
			if(p.next==null){
				p.next = new Nodes();
				p.next.item = data;
			}
			else {
				Nodes temp = p.next;
				p.next = new Nodes();
				p.next.item = data;
				p.next.next = temp;
			}
			
			
		}
	}
	
	public void removeFromLast(){
		if(head==null){
			System.out.println("No data");
			return;
		}
		else {
			Nodes p = head;
			while(p.next.next != null){
				p = p.next;
			}
			p.next = null;
		}
	}
	
	public void removeFromStart(){
		if(head==null){
			System.out.println("No data");
			return;
		}
		else {
			Nodes p = head;
			head = p.next;
			  
		}
	}
	
	public void removeFromKnownLocation(int k){
		if(head==null){
			System.out.println("No data");
			return;
		}
		else if(k ==0){
			Nodes p = head;
			head= p.next;
			return;
		}
		else {
			Nodes p = head;
			for(int i=0; i<k-1;i++){
				p = p.next;
			}
				Nodes temp = p.next.next;
				p.next = null;
				p.next = temp;
			
		}
	}
	
	
	public static void main(String[] args) {
		LinkedLists_Nodes ln = new LinkedLists_Nodes();
		ln.addNodeAtTheEnd(11);
		ln.addNodeAtTheEnd(12);
		ln.addNodeAtTheEnd(13);
		ln.addNodeAtTheEnd(54);
		ln.addNodeAtTheEnd(65);
		ln.addNodeAtTheEnd(76);
		ln.addNodeAtTheEnd(85);
		
		//ln.removeFromStart();
		//ln.removeFromKnownLocation(0);
		
//		ln.addAtTheStart(1);
//		ln.addAtTheStart(2);
//		ln.addAtTheStart(3);
//		ln.addAtTheStart(4);
		ln.addAtKnownLocation(34, 1);
		ln.printNodes();

	}

}
