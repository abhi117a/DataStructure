package CTC_2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
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
	
	public int findMaxR(TreeNode root){
		int MAX = Integer.MIN_VALUE;
		if(root != null){
			int leftMax = findMaxR(root.leftChild);
			int rightMax = findMaxR(root.rightChild);
			if(leftMax > rightMax){
				MAX = leftMax;
			}
			if(rightMax > leftMax){
				MAX = rightMax;
			}
			if(root.data > MAX){
				MAX = root.data;
			}
		}
		return MAX;
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
	
	
	public boolean findElementR(TreeNode root, int data){
		if(root==null){
			return false;
		}
		if(root.data==data){
			return true;
		}
		return (findElementR(root.leftChild, data) ||findElementR(root.rightChild, data)); 
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
			TreeNode temp = q.poll();
			if(temp !=null){
			count++;
			}
			if(temp == null){
				//count--;
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
		System.out.println("Size of Tree with level order traversal "+ height);
		
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
	
	
	public boolean findRecursion(TreeNode root, int data){
		if(root==null){
			return false;
		}
		if(root.data==data)
			return true;
		else {
			return findRecursion(root.leftChild, data) || findRecursion(root.rightChild, data);
	         }
	}
	
	
	public void check(){
		if(findRecursion(root, 56)){
			System.out.println("Value found");
		}
		else {
			System.out.println("Value not found");
			 }
	}
	
	
	public int findSizeR(TreeNode root){
		if (root== null){
			return 0;
		}
		else{
		return (findSizeR(root.leftChild)+1+findSizeR(root.rightChild));
	}}
	
	public int sizeRec(TreeNode root){
		
		if(root== null){
			return 0;
		}
		else {
			return(sizeRec(root.leftChild)+1+sizeRec(root.rightChild));
		}
	}
	public int sumOfNodes(TreeNode root){
		if(root==null){
			return 0;
		}
		else {
		return(sumOfNodes(root.leftChild)+sumOfNodes(root.rightChild)+root.data);
		}
		
	}
	
	
	public void zigZag(TreeNode root){
		Stack<TreeNode> stq = new Stack<TreeNode>();
		stq.push(root);
		
		boolean flag = false;
		while(!stq.isEmpty()){
			Stack<TreeNode>tempStq = new Stack<TreeNode>();
			
			while(!stq.isEmpty()){
				TreeNode temp  =stq.pop();
				System.out.println(temp.data);
				if(!flag){
					if(temp.leftChild!=null){
						tempStq.push(temp.leftChild);
					}
					if(temp.rightChild!=null){
						tempStq.push(temp.rightChild);
					}
				}
				else {
					if(temp.rightChild!=null){
						tempStq.push(temp.rightChild);
					}
					if(temp.leftChild!=null){
						tempStq.push(temp.leftChild);
					}
				}
			}
			flag = !flag;
			stq = tempStq;
		}
	}
	public static void verticalSum(HashMap<Integer, Integer> hash,TreeNode root, int c){
		if(root.leftChild!=null){
			verticalSum(hash,root.leftChild, c-1);
		}
		if(root.rightChild!=null){
			verticalSum(hash, root.rightChild, c+1);
		}
		int data =0;
		if(hash.containsKey(c)){
			data=hash.get(c);
			hash.put(c, root.data+data);
		}
		
	}
	public static void vSum(TreeNode root){
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		verticalSum(hash, root, 0);
		for(Entry<Integer, Integer> entry1 : hash.entrySet()){
		System.out.println("check");
			System.out.println("Key(pos): "+entry1.getKey()+"sum: "+entry1.getValue());
		}
		
	}
	
	public void printPath(TreeNode root){
		int Path[] = new int[1000];
		pathCalc(root,Path,0);
	}
	private void pathCalc(TreeNode root, int Path[],int pathLen){
		if(root==null){
			return;
		}
		Path[pathLen] = root.data;
		pathLen++;
		
		if(root.leftChild==null && root.rightChild==null){
			printPathVal(Path,pathLen);
		}
		else{
		pathCalc(root.leftChild,Path,pathLen);
		pathCalc(root.rightChild,Path,pathLen);
		}
		}
	
	private void printPathVal(int Path[],int pathLen){
		for(int p=0; p<pathLen;p++){
			System.out.println(Path[p]);
		}
		System.out.println("****");
	}
	
	
	public int findSumofTree(TreeNode root){
		if (root == null){
			return 0;
		}
		else {
			return (root.data+findSumofTree(root.leftChild)+findSumofTree(root.rightChild));
		}
		
	}
	
	public void LevelOrderTraversal(TreeNode root){
		Queue<TreeNode> qq = new LinkedList<TreeNode>();
		int counter=0;
		if(root!= null){
			qq.add(root);
			qq.add(null);
		}
		while(!qq.isEmpty()){
			TreeNode temp= qq.poll();
			if(temp!= null){
				//counter++;
			}
			if(temp!=null){
				if(temp.leftChild!=null){
					qq.add(temp.leftChild);
				}
				if(temp.rightChild!=null){
					qq.add(temp.rightChild);
				}
			}
			else if(temp==null){
				if(qq.isEmpty()){
					return;
				}
				else {
					qq.add(null);
					counter++;
					
				}
				
			}
		}
			
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
		
		tf.addData(5);
		tf.addData(2);
		tf.addData(17);
		tf.addData(3);
		tf.addData(0);
		tf.addData(15);
		tf.addData(49);
		tf.addData(52);
		tf.addData(60);
		//tf.inOrderTraversal(root);
		System.out.println("*******************");
		//tf.levelOrderTraversal(root);
		//tf.findminMax(root);
		//System.out.println("*******************");
		//tf.findElement(root, 88);
//		System.out.println("*******************");
//		tf.printRev(root);
//		tf.heightAndNoNodes(root);
//		tf.countLeafNodes(root);
//		System.out.println("*******************");
//		tf.countNoFullNodes(root);
//		tf.findLevelWithMaxSum(root);
//		tf.findRecursion(root, 2);
//		tf.check();
//		System.out.println("SIze of Tree with recursion method is "+tf.sizeRec(root));
//		System.out.println("Sum of nodes are "+tf.sumOfNodes(root));
//		tf.zigZag(root);
//		tf.vSum(root);
		
		tf.printPath(root);
		System.out.println(tf.findSumofTree(root));
		}
	
}