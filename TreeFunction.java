package CTC_2;



public class TreeFunction{

	TreeNode root;
	
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
				}
				if(focus==null){
					parent.leftChild = new TreeNode();
					parent.leftChild.data = data;
					return;
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
	public static void main(String[] args) {
		TreeFunction tf = new TreeFunction();
		tf.addData(20);
		tf.addData(10);
		tf.addData(30);
		tf.addData(15);
		}
	
}