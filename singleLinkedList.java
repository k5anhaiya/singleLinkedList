public class singleLinkedList{

    static void printSingleLinkedList(Node head){
        Node currNode=head;
        while (currNode != null) {
            System.out.println(currNode.data);
            currNode=currNode.next;
        }
        
    }
    public static void main(String[] args) {
        Node p1=new Node(10);
        Node p2=new Node(20);
        Node p3=new Node(30);
        Node p4=new Node(40);
        Node p5=new Node(50);
        Node p6=new Node(60);
        p1.next=p2;
        p2.next=p3;
        p3.next=p4;
        p4.next=p5;
        p5.next=p6;
        p6.next=null;

        Node head=p1;
        printSingleLinkedList(head);
    }
}