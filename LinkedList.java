package CTC_2;


public class LinkedList {
	static Node1 head;
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
	public void detectACycle(){
		Node1 slow=head;
		Node1 fast=head;
		while(slow.next!=null && fast.next!=null & fast.next.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast){
				System.out.println("Loop Found");
				return;
			}
		}
		System.out.println("No loop exists");
		return;
	}
	
	public void reverseList(){
		Node1 currNode = head;
		Node1 nextNode = null;
		Node1 prevNode = null;
		if(head.next==null){
			System.out.println("There is only one data");
			return;
		}
		else {
			while(currNode !=null){
				nextNode = currNode.next;
				currNode.next = prevNode;
				prevNode = currNode;
				currNode = nextNode;
			}
			head = prevNode;
			System.out.println("\n Reverse Through Iteration");
			
			
		}
		
		
	}
	int CompareLists(Node1 headA, Node1 headB) {
	    // This is a "method-only" submission. 
	    // You only need to complete this method 
	    
	    if(headA==null && headB != null || headA != null && headB == null){
	        return 0;
	    }
	    else {
	        Node1 pa = headA;
	        Node1 pb = headB;
	        while(pa.next != null && pb.next != null){
	            pb = pb.next;
	            pa = pa.next;
	            if(pb.data != pa.data){
	                return 0;
	            }
	        }
	        if(pa.next == null && pb.next != null||pa.next != null && pb.next == null){
	            return 0;
	        }
	        return 1;
	    }
	    
	  
	}
	Node1 MergeLists(Node1 headA, Node1 headB) {
	      
	    Node1 head = new Node1();
	    Node1 p = head;
	    if(headA == null && headB == null){
	        return null;
	    }
	    else {
	        Node1 pa = headA;
	        Node1 pb = headB;
	        while(pa.next != null || pb.next != null){
	            if(pa.data > pb.data){
	                p = pb;
	                p = p.next;
	                pb = pb.next;
	            }
	            else {
	                p = pa;
	                p = p.next;
	                pa = pa.next;
	            }
	            
	        }
	        if(pa.next == null){
	            p = pb;
	            return head;
	        }
	        else {
	            p = pa;
	            return head;
	        }
	    }

	}
    
int GetNode(Node1 head,int n) {
     int count =1;
    Node1 p = head;
    while(p != null){
        p = p.next;
        count++;
    }
    Node1 p1 = head;
    while(p1 != null){
    	if(count!=n){
        p1 = p1.next;
            count--;
    	}
    	return p1.data;
    }
    return p1.data;

}
/*Node1 RemoveDuplicates(Node1 head) {
	  if(head==null){
	      return null;
	  }
	    else {
	        Node1 p = head;
	        while(p.next != null){
	            if(p.data == p.next.data){
	               // p.next = null;
	                p.next =p.next.next; 
	            }
	            p = p.next;
	        }
	        return head;
	    }
	}*/

Node1 RemoveDuplicates(Node1 head) {
	 boolean flag = true;
	    if(head==null){
	      return null;
	  }
	    else {
	        while(flag == true){
	        Node1 p = head;
	        while(p.next != null){
	            if(p.data == p.next.data){
	                //p.next = null;
	                p.next =p.next.next; 
	            }
	            p = p.next;
	        }
	            if(head.data == head.next.data){
	                flag = true;
	            }
	            else {
	                flag = false;
	            }
	        }
	        return head;
	    }
	}

public void remDuplicate (Node1 head){
	if(head==null|| head.next==null){
		System.out.println("Linkedlist is empty or having just one element");
	}
	Node1 p= head;
	while(p.next!=null){
		Node1 runner = p;
		while(runner.next != null){
			if(runner.next.data == p.data){
				runner.next = runner.next.next;
			}
			else {
				runner = runner.next;
			}
		}
		p = p.next;
	}
}
	
	public static void main(String[] args) {
		LinkedList ls = new LinkedList();
		ls.addATBeginning(1);
		ls.addATBeginning(2);
		ls.addATBeginning(3);
		ls.addATBeginning(4);
		ls.addATBeginning(5);
		ls.addATBeginning(5);
		ls.addATBeginning(6);
		ls.remDuplicate(head);
		//System.out.println(ls.RemoveDuplicates(head));
		//ls.reverseList();
//		ls.addAtEnd(1);
//		ls.addAtEnd(2);
//		ls.addAtEnd(3);
		//ls.addatKnownLocation(1, 7);
		//ls.removeAtLocation(1);
		//ls.removeAtEnd();
		//ls.removeAtBegining();
		ls.printNodes();
	}

}
