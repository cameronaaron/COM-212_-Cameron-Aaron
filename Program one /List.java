//Program One: Implement an unordered linked list with the following methods:
//length(L) -- returns n
//isEmptyList(L) --	returns true if the list is empty and false if it is not
//searchReturn(L, key) -- returns a pointer to the node x where the key of x = key
//searchRemove(L, key) -- returns a pointer to the node x where the key of x = key and removes x from the list
//insert(L, x) -- inserts x into the list
//printList(L) -- prints the keys of each of the nodes of the list in the order they are in the list
//A test program that adds a few nodes and then tests each of the list functions is a follows: TestList.java
//If you implement your list such that new nodes are added to the front of the list and you have the method printList() first print n and then the keys of the list, the output should be: TestListOutput.txt
//This assignment is due 7 Mar before class. Submit your class description.
//Cameron Aaron
//03/4/2018
//
//declare List class
public class List {
    private int n;
    private Node head;
    private Node temp;
    private Node temp2;
//Create List function
    public List() {
        n = 0;
        head = null;


    }
//length function
    public int length() {
        return n;
    }
//IsemptyList function
    public boolean isEmptyList() {
        return (n == 0);

    }
//IsemptyList function
    public void insert(Node newNode) {
        if (n == 0) {
            head = newNode;
            n++;

        } else {
            temp = newNode;
            temp.setNext(head);
            head = temp;
            n++;


        }


    }
    // create Search return function
    public Node searchReturn(int key) {
        if (head.getKey() == key) {
            return head;
        } else {
            temp = head.getNext();
        }
        if (temp == null) {
            return null;


        }

        for (int i = 1; i < n; i++) {
            if (temp.getKey() == key) {
                return temp;
            }
            else{
                temp = temp.getNext();


            }

        }
        return null;


    }
//SearchRemove
    public Node searchRemove(int key) {
        if (head.getKey() == key) {
            temp = head;
            head = temp.getNext();
            n--;
            return temp;
        }
        else {
            temp = head;
        }
        while ((temp.getNext() != null) && (temp.getNext().getKey() != key)) {
            temp = temp.getNext();


        }
        if (temp.getNext().getKey() == key) {
            temp2 = temp.getNext();
            temp.setNext(temp2.getNext());
            n--;
            return temp2;


        }
        return null;


    }
// Print List function
    public void printList() {
        System.out.println(n);
        if (n == 0) {
            System.out.println("list is empty");
        }
        else {
            temp = head;
            for (int i = 0; i < n; i++) {
                System.out.println(temp.getKey());
                temp = temp.getNext();

            }
        }
    }
}

