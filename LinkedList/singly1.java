package LinkedList;
public class singly1 {
    public static void main(String[] args) {
        // Create sample linked list: 1 -> 2 -> 3 -> 4 -> null    (nb null is not a node, just a pointer)
        Node1 fourthNode1 = new Node1(4, null);
        Node1 thirdNode1 = new Node1(3, fourthNode1);
        Node1 secondNode1 = new Node1(2, thirdNode1);
        Node1 head = new Node1(1, secondNode1);

        // Call the traverse method
        int count = traverse(head);
        System.out.println("Number of nodes in the linked list: " + count);

    }
    //Find the total nodes in the linkedlist
    public static int traverse(Node1 head){
        int count=0;
        Node1 currentNode1 = head;
        while(currentNode1 !=null){
            currentNode1 = currentNode1.getNext();
            count++;
        }
        return count;
    }
    //time complexity is O(n) since we are traversing thru the whole linkedlist

}
