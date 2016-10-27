package CTC_2;
//Implementation of Queue using Circular array of fixed size.
public class Queues {
	int arr[] = new int[5];
	int read =0;
	int write= 0;
	int size = -1;
	int CAPACITY = 5;
	
	public void enQueue(int Val){
		if(size == CAPACITY-1 ){
			System.out.println("Queue is FULL");
		}
		else {
			size++;
			arr[write] = Val;
			write = (write+1)%CAPACITY;
			for(int i=0; i<arr.length;i++){
				System.out.println("Value after enQueue: "+ arr[i]);
			}
			System.out.println("********************");
		}
	}
	public void deQueue(){
		if(size <0){
			System.out.println("Queue is empty");
		}
		else {
			size--;
			int temp = arr[read];
			arr[read] = Integer.MIN_VALUE;
			read = (read+1)%CAPACITY;
			for(int i=0;i<arr.length;i++){
			//System.out.println("deQueue Value: "+temp);
			System.out.println("Value after dequeue: "+arr[i]);
		}
			System.out.println("****************************");
		}
	}
	
	public static void main(String[] args) {
		Queues q = new Queues();
		q.enQueue(11);
		q.enQueue(12);
		q.enQueue(13);
		q.enQueue(14);
		q.enQueue(15);
		q.enQueue(15);
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();

	}

}
