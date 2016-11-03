package CTC_2;

import java.util.LinkedList;
import java.util.Queue;



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
	
	
	public static void main(String[] args) {
		TreeFunction tf = new TreeFunction();
		tf.addData(20);
		tf.addData(10);
		tf.addData(30);
		//tf.addData(15);
		//tf.addData(44);
		tf.inOrderTraversal(root);
		System.out.println("*******************");
		tf.levelOrderTraversal(root);
		}
	
}