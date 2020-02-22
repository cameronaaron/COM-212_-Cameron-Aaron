//Node.java
// Cameron Aaron
//2/28/2018
// Implement a node class using Java. Make up some fields; at least include name, include SSN (as an integer), plus a Node pointer called next. The class name should be Node and to make a pointer just delare an instance variable of type Node called next.
//private Node next;
//Write methods to get and set the different fields. Write a method that returns a key which will return the last 4 digits of the SSN.
//A test program that checks to make sure the methods work is as follows:
//Declaires Node class
public class Node {
    //creates int ssn
    private int ssn;
    //creates name
    private String name;
    //Creates next node
    private Node next;

// constricts our node
    public Node(String name, int ssn){
        this.ssn = ssn;
        this.name = name;
        this.next = null;
    }
// Parses key
    public int getKey() {
        int key = ssn%10000;
        return key;

    }


// returns the ssn
    public int getSSN() {
        return ssn;
    }
// Sets SSN
    public void setSSN(int ssn) {
        this.ssn = ssn;
    }
//Returns name
    public String getName() {
        return name;
    }
// Sets ssn
    public void setSsn(int ssn) {
        this.ssn = ssn;
    }
    //Sets Name
    public void setName(String Name){
        this.name = Name;

    }
    //Sets Next
    public void setNext(Node next){
            this.next = next;

    }
    //Sets Next
    public Node getNext(){
            return this.next;

    }


}
