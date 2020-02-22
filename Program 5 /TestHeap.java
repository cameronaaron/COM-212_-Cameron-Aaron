//Cameron Aaron


public class TestHeap
{
	public static void main(String[] args)
	{
		// creating the unit test
		Heap a = new Heap();
		//returns true or false to see if the heap is empty
		System.out.println("isEmpty = " + a.isEmptyset());
		//these are our test nodes
		Node xNode = new Node("Jane", 123456789);
		Node yNode = new Node("Joe", 934567890);
		Node zNode = new Node("Jack", 223452234);
		Node kNode = new Node("Jill", 934567856);
		Node aNode = new Node("Abe", 123456788);
		Node bNode = new Node("Beth", 934567898);
		Node cNode = new Node("Chuck", 223452238);
		Node dNode = new Node("Dot", 934567858);
		//Insert the test nodes
		a.insert(xNode);
		a.insert(yNode);
		a.insert(zNode);
		a.insert(kNode);
		a.printHeap();
		//check the min function
		System.out.println("Find Min " + a.findMin().getKey());
		//delete the min
		System.out.println("Delete Min");
		a.deleteMin();
		System.out.println("New Min " +a.findMin().getKey());
		a.insert(aNode);
		a.insert(bNode);
		a.insert(cNode);
		a.insert(dNode);
		a.printHeap();
		System.out.println("Find Min " + a.findMin().getKey());
		System.out.println("Delete Min");
		a.deleteMin();
		System.out.println("New Min " + a.findMin().getKey());
		System.out.println("isEmpty = " + a.isEmptyset());
		System.out.println("Deleted 3 Min");
		a.deleteMin();
		a.deleteMin();
		a.deleteMin();
		a.printHeap();
		System.out.println("Find Min " + a.findMin().getKey());
		System.out.println("Deleted 3 Min");
		a.deleteMin();
		a.deleteMin();
		a.deleteMin();
		//is it still empty?
		System.out.println("isEmpty = " + a.isEmptyset());
		System.out.println("Deleted Min");
		a.deleteMin();
	}
}