package Collections;



public class Runner 
{

	public static void main(String[] args) 
	{
		
		LinkedList list=new LinkedList();
		list.insert(5);
		list.insert(7);
		list.insert(9);
		list.insertAtStart(3);
		list.insertAt(4, 11);
		list.show();
		
	}

}
