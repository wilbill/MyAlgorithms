package LinkedList;
public class Node1 {
    private int data;
    private Node1 next; //pointer is named next and is of data type node.

    public Node1(int data, Node1 next){
        this.data = data;
        this.next = next;
    }
    public void setData(int data){
        this.data = data;
    }
    public int getData(){
        return data;
    }

    public void setNext(Node1 next) {
        this.next = next;
    }
    public Node1 getNext() {
        return next;
    }


}
