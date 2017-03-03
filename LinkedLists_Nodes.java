package CTC_2;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;

public class LinkedLists_Nodes {

	static Nodes head;
	static Nodes head1;
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
	
	
	public void printNodes(Nodes mains){
		if(mains==null){
			System.out.println("No data");
			return;
		}
		Nodes p = mains; 
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
	
	public void removeDuplicates(){
		Hashtable<Integer,Integer> ht = new Hashtable<Integer,Integer>();
		
		if(head==null || head.next==null){
			System.out.println("No data or just one element");
		}
		else {
			Nodes p = head;
			while(p.next!=null){
			if(ht.containsKey(p.next.item)){
				if(p.next.next!=null){
				Nodes temp = p.next.next;
				p.next = null;
				p.next = temp;
				}
				else{
					p.next = null;
					return;
				}
			}
			else {
				ht.put(p.next.item, 1);
			}
			p = p.next;
			}
		}
	}
	
	public void removeDuplicates2Pointers(){
		if(head==null || head.next==null){
			System.out.println("No data or just 1 data");
		}
		else {
			Nodes p1 = head;
			Nodes p2 = p1.next;
			while(p1.next!=null){
					if(p1.item==p2.item){
					if(p1.next.next!=null){
						Nodes temp = p1.next.next;
						p1.next = null;
						p1.next = temp;
						p2 = p1.next;
						if(p2.next!=null){
						p2= p2.next;
						}
						}
					else {
						p1.next = null;
						return;
					}
					}
					else {
						if(p2.next==null && p1.next !=null){
							p2 = p1.next;
						}else{
							p2 = p2.next;	
						}
					}
			p1 = p1.next;
			}
		}
	}
	
	public void findKthelement(int k){
		Nodes p1 = head;
		Nodes p2 = head;
		while(p1.next!=null){
			if(k>0){
				p1 = p1.next;
				k--;
			}
			else {
				p1 = p1.next;
				p2 = p2.next;
			}
		}
		System.out.println(p2.item);
		
	}
	
	public void findKthElementUsingLength(int k){
		Nodes p = head;
		int len=1;
		while(p.next != null){
			len++;
			p = p.next;
		}
		int fin = len-k;
		p = head;
		for(int i=1;i<fin;i++){
			p = p.next;
		}
		System.out.println(p.item);
	}
	
	public void sortByGivenValue(int k){
		Nodes p = head;
		head1 = new Nodes();
		head1.item = k;
		Nodes f = head1;
		while(p.next!=null){
			if(p.item >= k ){
				f.next = new Nodes();
				f.next.item = p.item;
				f = f.next;
			}
			else {
				Nodes temp = new Nodes();
				temp.item = p.item;
				temp.next = head1;
				head1 = temp;
			}
			p = p.next;
		}
		
	}
	public void manuplatingLinkedListUsingStringBuilder(){
		Nodes p = head;
		StringBuilder sb = new StringBuilder();
		while(p.next != null){
			sb.append(p.item);
			p = p.next;
		}
		sb.append(p.item);
		System.out.println("Straight LinkedList: "+sb);
		System.out.println("Reverse LinkedList: "+sb.reverse());
		System.out.println("Mathematical Manuplation: "+Integer.parseInt(sb.toString())+10000);
	}
	
	
	public void checkIfPalindrome(){
		if(head==null && head.next==null){
			System.out.println("Cannot be a palindrome");
		}
		else {
			Nodes p = head;
			int len = 1;
			while(p.next != null){
				len++;
				p = p.next;
				}
			p = head;
			int init=0;
			int [] arr = new int [len];
			while(p.next != null){
				arr[init] = p.item;
				init++;
				p = p.next;
			}
			arr[init] = p.item;
			if(len%2==0){
				System.out.println("Cannot be a palindrome because of even length");
				return;
			}
			else {
				
				int rev = arr.length-1;
				for(int i=0;i<arr.length/2;i++){
					if(arr[i]!=arr[rev]){
						System.out.println("Not a palindrome");
						return;
					}
				}
				System.out.println("A palindrome");
			}
		}
	}
	
	public static void main(String[] args) {
		//StringBuilder sv = new StringBuilder();
//		sv.append("2");
//		sv.append("3");
//		sv.append("4");
//		sv.reverse();
//		System.out.println(sv);
//		int num = Integer.parseInt(sv.toString());
//		System.out.println(num+1000);
		
		
		LinkedLists_Nodes ln = new LinkedLists_Nodes();
		ln.addNodeAtTheEnd(1);
		ln.addNodeAtTheEnd(2);
		ln.addNodeAtTheEnd(3);
		ln.checkIfPalindrome();
		//ln.manuplatingLinkedListUsingStringBuilder();
		
		
//		ln.addNodeAtTheEnd(55);
//		ln.addNodeAtTheEnd(64);
//		ln.addNodeAtTheEnd(72);
//		ln.addNodeAtTheEnd(88);
//		ln.sortByGivenValue(55);
		
		
		//ln.findKthelement(3);
		//ln.findKthElementUsingLength(3);
		//ln.removeDuplicates2Pointers();
		//ln.removeDuplicates();
		//ln.removeFromStart();
		//ln.removeFromKnownLocation(0);
		
//		ln.addAtTheStart(1);
//		ln.addAtTheStart(2);
//		ln.addAtTheStart(3);
//		ln.addAtTheStart(4);
		//ln.addAtKnownLocation(34, 1);
		//ln.printNodes(head1);

	}

}
