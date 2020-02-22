//Cameron Aaron
//Mar 23 2018
//

//
public class StackA {
    private Node[] stack;
    private int stack_size = 0;
    private int array_size = 100;

    // Declaire the Stack
    public StackA() {
        stack = new Node[array_size];
    }

    // This is the creatin of the is empty function this will tell you
    public boolean isEmpty() {
        return stack_size == 0;
    }

    // This removes from the top of the stack
    public Node pop() {
        Node result = stack[stack_size - 1];
        stack[stack_size - 1] = null;
        stack_size--;

        return result;
    }

    // This returns the node at the top of the stack
    public Node top() {
        return stack[stack_size - 1];
    }

    // This pushes a peice of data to the top of the stack
    public void push(Node node) {
        stack[stack_size] = node;
        stack_size++;
    }

    // This prints the stack
    public void printStack() {
        System.out.println(stack_size);
        for (int i = stack_size - 1; i >= 0; i--) {
            System.out.println(stack[i].getKey());
        }
    }

}
