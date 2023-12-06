public class singleLinkedListCreate {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static void printLinkedList(Node head){
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        } 
    }
    public static void main(String[] args) {
        Node p1=new Node(10);
        Node p2=new Node(20);
        Node p3=new Node(30);
        Node p4=new Node(40);
        Node p5=new Node(50);
        p1.next=p2;
        p2.next=p3;
        p3.next=p4;
        p4.next=p5;
        p5.next=null;

        Node head =p1;
        printLinkedList(p1);

    }
}
