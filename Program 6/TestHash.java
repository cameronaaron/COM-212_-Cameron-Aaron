public class TestHash {
    public static  void main(String[] args){
        hash a=new hash();
        System.out.println("isEmpty =" +a.isEmpty());
        Node xNode = new Node("Jane", 123456789);
        Node yNode = new Node("Joe", 934567890);
        Node zNode = new Node("Jack", 223452234);
        Node kNode = new Node("Jill", 934567856);
        Node aNode = new Node("Abe", 123456788);
        Node bNode = new Node("Beth", 934567898);
        Node cNode = new Node("Chuck", 223452238);
        Node dNode = new Node("Dot", 934567858);
        System.out.println("Printing nodes");
	System.out.println("");
        a.insert(xNode);
        a.insert(yNode);
        a.insert(zNode);
        a.insert(kNode);
        a.printhastable();
        System.out.println("isEmpty =" +a.isEmpty());
        System.out.println("Looking up key 6789"+a.lookup(6789));
	System.out.println("");
        System.out.println("insert more nodes");
	System.out.println("");
        a.insert(aNode);
        a.insert(bNode);
        a.insert(cNode);
        a.insert(dNode);
        System.out.println("print output ");
	System.out.println("");

        a.printhastable();
        System.out.println("deleting key 7890, 1234,6789");
	System.out.println("");
        a.delete(7890);
        a.delete(1234);
        a.delete(6789);
        a.printhastable();
        System.out.println("isEmpty =" +a.isEmpty());


    }


}
