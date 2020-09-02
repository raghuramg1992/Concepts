package DataStructure;

import java.util.Scanner;

class Node{
	Node left,right;
	int data;
	public Node(int data) {
		this.data=data;
	}

public void printInOrder() {
	if(left!=null) {
		left.printInOrder();
	}
	System.out.println(data);
	if(right!=null) {
		right.printInOrder();
	}
}
}
public class BinaryTree {
	
	public static Node insert(Node node, int value) {
	    if(node == null) {
	        return new Node(value);
	    } else {
	        Node cur;
	        if(value <= node.data) {
	            cur = insert(node.left, value);
	            node.left = cur;
	        } else {
	            cur = insert(node.right, value);
	            node.right = cur;
	        }
	        return node;
	    }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root=insert(root,data);
        }
        
        scan.close();
        root.printInOrder();

	}

}
