package CTC_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;



public class TreeFunction{

	static TreeNode root;
	
	public void addData(int data){
		if(root==null){
			root = new TreeNode();
			root.data = data;
		}
		else {
			TreeNode parent;
			TreeNode focus = root;
			while(true){
				parent = focus;
				if(data < focus.data){
					focus = focus.leftChild;
				if(focus==null){
					parent.leftChild = new TreeNode();
					parent.leftChild.data = data;
					return;
				}
				}
				else {
					focus = focus.rightChild;
					if(focus == null){
						parent.rightChild = new TreeNode();
						parent.rightChild.data = data;
						return;
					}
				}
			}
		}
	}
	
	public void inOrderTraversal(TreeNode root){
		if(root!= null){
			inOrderTraversal(root.leftChild);
			System.out.println(root.data);
			inOrderTraversal(root.rightChild);
		}
		
	}
	
	public void preOrderTraversal(TreeNode root){
		if(root!=null){
			System.out.println(root.data);
			preOrderTraversal(root.leftChild);
			preOrderTraversal(root.rightChild);
		}
	}
	
	public void postOrderTraversal(TreeNode root){
		if(root!= null){
			postOrderTraversal(root.leftChild);
			postOrderTraversal(root.rightChild);
			System.out.println(root.data);
		}
	}
	public void levelOrderTraversal(TreeNode root){
		Queue<TreeNode> queue =  new LinkedList<TreeNode>();
		queue.add(root);
		while(!queue.isEmpty()){
			TreeNode temp = queue.poll();
			System.out.println(temp.data);
			if(temp.leftChild!= null){
				queue.add(temp.leftChild);
			}
			if(temp.rightChild!=null){
				queue.add(temp.rightChild);
			}
		}
		
	}
	
	public void findminMax(TreeNode root){
		int max;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		max = root.data;
		queue.add(root);
		
		while(!queue.isEmpty()){
			TreeNode temp = queue.poll();
			if(temp.data > max){
				max = temp.data;
			}
			if(temp.leftChild!=null){
				queue.add(temp.leftChild);
			}
			if(temp.rightChild!=null){
				queue.add(temp.rightChild);
			}
		}
		System.out.println("Max value is "+max);
		
	}
	
	public void findElement(TreeNode root, int lookup){
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		if(root!= null){
			q.add(root);
		}
		while(!q.isEmpty()){
			TreeNode temp = q.poll();
			if(temp.data==lookup){
				System.out.println("Element found");
				return;
			}
			if(temp.leftChild!=null){
				q.add(temp.leftChild);
			}
			if(temp.rightChild!= null){
				q.add(temp.rightChild);
			}
		}
		System.out.println("Element not found");
	}
	
	public void printRev(TreeNode root){
		Stack<Integer> stkqq = new Stack<Integer>();
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		if(q.isEmpty()){
			q.add(root);
		}
		while(!q.isEmpty()){
			TreeNode temp= q.poll();
			stkqq.add(temp.data);
			if(temp.rightChild!=null){
				q.add(temp.rightChild);
			}
			if(temp.leftChild!=null){
				q.add(temp.leftChild);
			}
		}
		while(!stkqq.empty()){
			System.out.println(stkqq.pop());
		}
	}
	
	public void heightAndNoNodes(TreeNode root){
		Stack<TreeNode> stqq = new Stack();
		int count =1,height=0;;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		if(q.isEmpty()){
			q.add(root);
			q.add(null);
		}
		while(!q.isEmpty()){
			count++;
			TreeNode temp = q.poll();
			count++;
			if(temp == null){
				count--;
				if(q.isEmpty()){
					//System.out.println("Height is "+height);
					break;
				}
				else {
					q.add(null);
					height++;
				}
			}
			else {
			if(temp.leftChild!=null){
				q.add(temp.leftChild);
			}
			if(temp.rightChild!= null){
				q.add(temp.rightChild);
			}
		}
			}
		System.out.println("Size of Tree "+ height);
		
	}
	
	public void countLeafNodes(TreeNode root){
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		int count=1;
		if(root!=null){
			q.add(root);
		}
		while(!q.isEmpty()){
			TreeNode temp = q.poll();
			if(temp.leftChild==null && temp.rightChild==null){
				count++;
			}
			if(temp.leftChild!= null){
				q.add(temp.leftChild);
			}
			if(temp.rightChild!=null){
				q.add(temp.rightChild);
			}
		}
		System.out.println("Number of leaf Nodes "+count);
	}
	
	public void countNoFullNodes (TreeNode root){
		int count=0;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		if(root!=null){
			q.add(root);
			if(root.leftChild!=null && root.rightChild!=null){
				count++;
			}
		}
			while(!q.isEmpty()){
				TreeNode temp = q.poll();
				if(temp.leftChild!=null && temp.rightChild!=null){
					count++;
				}
				if(temp.leftChild!=null){
					q.add(temp.leftChild);
				}
				if(temp.rightChild!=null){
					q.add(temp.rightChild);
				}
			}
			System.out.println("The number of full nodes is "+count);
		
	}
	
	public void findLevelWithMaxSum (TreeNode root){
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		int tempMax = Integer.MIN_VALUE;
		int max = Integer.MIN_VALUE;
		if(root!=null){
			q.add(root);
			q.add(null);
			//tempMax = root.data;
		}
			
			while(!q.isEmpty()){
			TreeNode temp = q.poll();
			if(temp!=null) {
				tempMax = tempMax+temp.data;
			if(temp.leftChild!= null){
				q.add(temp.leftChild);
			}
			if(temp.rightChild!=null){
				q.add(temp.rightChild);
			}
			}
			else{
				if(tempMax >= max){
					max = tempMax;
				tempMax =0;
				if(!q.isEmpty()){
				q.add(null);
				}
			}
			}
		}
			System.out.println("The Max sum is "+max);
	}
	
	
	public static void main(String[] args) {
		TreeFunction tf = new TreeFunction();
//		TreeFunction tf1 = new TreeFunction();
//		tf1.addData(40);
//		tf1.addData(20);
//		tf1.addData(60);
//		tf1.addData(30);
//		tf1.addData(88);
//		tf1.addData(16);
//		tf1.addData(14);
		System.out.println();
		tf.addData(5);
		tf.addData(2);
		tf.addData(17);
//		tf.addData(15);
//		tf.addData(49);
//		tf.addData(52);
//		tf.addData(60);
		//tf.inOrderTraversal(root);
		System.out.println("*******************");
		tf.levelOrderTraversal(root);
		//tf.findminMax(root);
		//System.out.println("*******************");
		//tf.findElement(root, 88);
		System.out.println("*******************");
		tf.printRev(root);
		tf.heightAndNoNodes(root);
		tf.countLeafNodes(root);
		System.out.println("*******************");
		tf.countNoFullNodes(root);
		tf.findLevelWithMaxSum(root);
		}
	
}