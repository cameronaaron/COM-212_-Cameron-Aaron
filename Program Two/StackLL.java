//Cameron Aaron
//Mar 23 2018
public class StackLL {
    //Accumulator
    private int n;
    //Head Node
    private Node head;

//Declaire public class
    public StackLL() {
        //Accumulator starts at 0
        n = 0;
        //Head starts at Null
        head = null;
    }
// Returns true if the list is empty
    public boolean isEmpty() {
        return n == 0;
    }
// Pop Funtion
    public Node pop() {
        Node x = head;
        head = head.getNext();
        n--;
        return x;

    }
// Return the top node in stack
    public Node top() {
        return head;
    }
// pushes node to top of stack
    public void push(Node xNode) {
        Node temp = head;
        head = xNode;
        head.setNext(temp);
        n++;
    }
//Prints the stack
    public void printStack() {
        System.out.println(n);
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getKey());
            temp = temp.getNext();

        }
    }

}