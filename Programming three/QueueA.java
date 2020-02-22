//Cameron Aaron
//Mar 23 2018
//

//
public class QueueA {
    private Node[] queue;
    private int n;
    private int head;

    // Declaire the Stack
    public QueueA() {
        queue = new Node[100];
        n=0;
        head=0;





    }

    // This is the creatin of the is empty function this will tell you
    public boolean isEmpty() {
        return n == 0;
    }

    // This removes from the top of the stack
    public Node dequeue() {
        if (n==0){
            return null;

        }
       int temp = head;

        head++;
        n--;
        return queue[temp%100];

    }

    // This returns the node at the top of the stack
    public Node front() {
        if (n==0) {
            return null;
        }
        else{
            return queue[head];
            }

        }


    // This pushes a peice of data to the top of the stack
    public void enqueue(Node node) {
        queue[(n+head)%100] = node;
        n++;
    }

    // This prints the stack
    public void printQueue() {
        head=head%100;
        int tail= (head+n)%100;

        System.out.println(head);
        System.out.println(tail);
        if (head <= tail)
            for(int i = head; i < tail; i++)
                System.out.println(queue[i].getKey());
        else {
            for(int i = head; i < 100; i++)
                System.out.println(queue[i].getKey());
            for(int i = 0; i < tail; i++)
                System.out.println(queue[i].getKey());
        }
    }


}
