package base;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Node first = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);

    first.nextnode = second;
    second.nextnode = third;



    }
}
