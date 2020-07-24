/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-07-24
 * Time:21:36
 **/
class Node {
    private Node next;
    private int data;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
    public void setData(int data){
        this.data = data;
    }
    public int getData(){
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
public class MyLinkedList {
    public Node head;
    public void addLast(int data){
        Node node = new Node(data);
        if (this.head == null){
            head = node;
            return;
        }
        Node cur = this.head;
        while(cur.getNext() != null){
            cur = cur.getNext();
        }
        cur.setNext(node);
    }
    public Node reverse(){
        Node prev = null;
        Node newHead = null;
        Node cur = this.head;
        while(cur != null){
            Node curNext = cur.getNext();
            if (curNext == null){
                newHead = cur;
            }
            cur.setNext(prev);
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }
    public void display2(Node newHead){
        Node cur = newHead;
        while(cur != null){
            System.out.print(cur.getData()+" ");
            cur =cur.getNext();
        }
    }
    public void display(){
        Node cur = this.head;
        while(cur != null){
            System.out.print(cur.getData()+" ");
            cur = cur.getNext();
        }

    }
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(10);
        myLinkedList.addLast(20);
        myLinkedList.addLast(30);
        myLinkedList.addLast(40);
        myLinkedList.addLast(50);
        myLinkedList.display();
        Node ret = myLinkedList.reverse();
        myLinkedList.display2(ret);
        /*Node ret = myLinkedList.reverse();
        myLinkedList.display2(ret);*/
    }
}
