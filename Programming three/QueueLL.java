//Cameron Aaron
//Mar 23 2018
public class QueueLL {
    //Accumulator
    private int n;

    //Head Node
    private Node head;
    private  Node tail;

    //Declaire public class
    public QueueLL() {
        //Accumulator starts at 0
        n = 0;
        //Head starts at Null
        head = null;
        tail=null;
    }
    // Returns true if the list is empty
    public boolean isEmpty() {
        return n == 0;
    }
    // Pop Funtion
    public Node dequeue() {
        if (n==0) {
            return null;
        }
        Node x = head;
        head = head.getNext();
        x.setNext(null);
        n--;
        return x;

    }
    // Return the top node in stack
    public Node front() {
        if (n==0){
            return null;
        }
        else{
            return head;
        }

    }
    // pushes node to top of stack
    public void enqueue(Node xNode) {
        if (tail==null){
            tail=xNode;
            head=xNode;
            n++;
        }
        else {
            tail.setNext(xNode);
            tail=tail.getNext();
            n++;
        }
    }
    //Prints the stack
    public void printQueue() {
        System.out.println(n);
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getKey());
            temp = temp.getNext();
        }
    }


}

